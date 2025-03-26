package com.youtube.central.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
<<<<<<< HEAD
import jakarta.persistence.Id;
=======
>>>>>>> 8964d10f439790efbdf86080a528f58c5ebc9848
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class userWatchHistory {
<<<<<<< HEAD
  @Id
=======
>>>>>>> 8964d10f439790efbdf86080a528f58c5ebc9848
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
   UUID userId;
   String videoId;
   int count;
   boolean isLiked;

   LocalDateTime lastWatched;


}
