package com.social.media.controllers;

import com.social.media.models.SocialUser;
import com.social.media.service.SocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SocialController {
    @Autowired
    private SocialService socialService;

    @GetMapping("/social/fetchAllUsers")
    public ResponseEntity<List<SocialUser>> getAllSocialUsers() {
        return new ResponseEntity<>(socialService.getAllUsers(), HttpStatus.OK);
    }

    @PostMapping("/social/saveUser")
    public ResponseEntity<SocialUser> saveSocialUser(@RequestBody SocialUser socialUser) {
        return new ResponseEntity<>(socialService.createUser(socialUser),HttpStatus.CREATED);
    }

    @DeleteMapping("/social/deleteUser/{id}")
    public ResponseEntity<String> deleteSocialUser(@RequestParam long id) {
        return new ResponseEntity<>(socialService.deleteUser(id),HttpStatus.OK);
    }
}
