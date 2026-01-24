package com.social.media.models;

import jakarta.persistence.*;

@Entity
public class SocialUser {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    @JoinColumn
    private SocialProfile profile;
}
