package com.social.media.service;

import com.social.media.models.SocialUser;

import java.util.List;

public interface SocialService {
    public List<SocialUser> getAllUsers();
    public SocialUser createUser(SocialUser socialUser);
    public String deleteUser(long id);
}
