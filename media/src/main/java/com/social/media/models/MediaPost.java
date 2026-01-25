package com.social.media.models;

import jakarta.persistence.*;

@Entity
public class MediaPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private SocialUser user;
}
