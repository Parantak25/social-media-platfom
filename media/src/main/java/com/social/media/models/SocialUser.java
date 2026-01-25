package com.social.media.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class SocialUser {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    @JoinColumn
    private SocialProfile profile;

    @OneToMany(mappedBy = "user")
    private List<MediaPost> posts = new ArrayList<>();
}
