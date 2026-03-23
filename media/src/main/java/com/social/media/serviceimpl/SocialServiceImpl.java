package com.social.media.serviceimpl;

import com.social.media.models.SocialUser;
import com.social.media.repositories.SocialUserRepository;
import com.social.media.service.SocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialServiceImpl implements SocialService {

    @Autowired
    SocialUserRepository socialUserRepository;

    @Override
    public List<SocialUser> getAllUsers() {
        return socialUserRepository.findAll();
    }

    @Override
    public SocialUser createUser(SocialUser socialUser) {
        return socialUserRepository.save(socialUser);
    }

    @Override
    public String deleteUser(long id) {
        socialUserRepository.deleteById(id);
        return "User deleted successfully";
    }
}
