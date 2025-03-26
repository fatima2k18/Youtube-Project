package com.youtube.central.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="channels")
public class Channel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    @ManyToOne
    AppUser user;
    Double watchHours;
    boolean isMonetized;
    int totalViews;
    int totalLikedCount;
    int totalSubs;
   @OneToMany
   List<Video> videos;
   @OneToMany
   List<PlayList> playLists;







}
