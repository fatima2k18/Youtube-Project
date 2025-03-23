package com.youtube.central.models;

import jakarta.persistence.*;
import lombok.*;

import javax.annotation.processing.Generated;
import java.util.List;
import java.util.UUID;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="playLists")
public class PlayList {
   @Id

   @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
   @OneToOne
    Channel channel;
   @OneToMany
   List<Video> videos;
}
