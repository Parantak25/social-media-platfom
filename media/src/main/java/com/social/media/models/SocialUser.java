package com.social.media.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    @ManyToMany
    @JoinTable(
            joinColumns =  @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "group_id")
    )
    private Set<SocialGroup> groups = new HashSet<>();
}
