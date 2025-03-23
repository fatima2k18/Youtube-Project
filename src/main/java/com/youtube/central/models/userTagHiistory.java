package com.youtube.central.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.repository.cdi.Eager;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class userTagHiistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    UUID userId;
    UUID tagId;
    int count;
    LocalDateTime lastWatched;



}
