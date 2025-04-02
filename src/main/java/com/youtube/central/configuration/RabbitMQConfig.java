package com.youtube.central.configuration;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.ConnectionFactory;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
@Configuration
public class RabbitMQConfig {
    //Details about the RabbitMQ
   public final  String exchangeName="notification-exchange";
   public final  String queueName="notification-queue";
   public final String routingKey="notification-123";
    @Bean
    public DirectExchange getDirectExchange(){
        ////String exchangeName;
        DirectExchange exchange=new DirectExchange(exchangeName);
        return exchange;
    }
    @Bean
    public Queue getMessagingQueue(){
        return QueueBuilder.durable(queueName).build();

    }
   @Bean
    public CachingConnectionFactory getConnectionFactory(){
       //ConnectionFactory is nothing but connection details for rabbitmq server
       CachingConnectionFactory connectionFactory=new CachingConnectionFactory("localhost");
       connectionFactory.setUsername("guest");
       connectionFactory.setPassword("guest");
       return connectionFactory;
   }
    @Bean
    public RabbitTemplate getRabbitTemplate(CachingConnectionFactory connectionFactory){
       //JSON -> Class Objects
        RabbitTemplate rabbitTemplate=new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(new Jackson2JsonMessageConverter());//message converter by springboot
        return  rabbitTemplate;
    }
    @Bean
    //bind queue and exchange
public Binding binQueueWithExchange(DirectExchange exchange, Queue queue){
        return BindingBuilder.bind(queue).to(exchange).with(routingKey);//Routing key -

         }
}

