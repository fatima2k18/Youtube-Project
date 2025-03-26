package com.youtube.central.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="tags")
public class Tag {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    @Column(unique = true)
    String name;

}
