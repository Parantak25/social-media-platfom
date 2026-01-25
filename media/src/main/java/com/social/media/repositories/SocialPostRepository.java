package com.social.media.repositories;

import com.social.media.models.MediaPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialPostRepository extends JpaRepository<MediaPost,Long> {
}
