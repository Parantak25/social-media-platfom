package com.social.media.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SocialUser {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private SocialProfile profile;

    @OneToMany(mappedBy = "user")
    private List<MediaPost> posts = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            joinColumns =  @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "group_id")
    )
    private Set<SocialGroup> groups = new HashSet<>();

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }

    //when we create a user with cascade the profile too gets created but the user is not updated with the profile, hence this custom setter
    public void setProfile(SocialProfile profile){
        profile.setUser(this);
        this.profile = profile;
    }
}
