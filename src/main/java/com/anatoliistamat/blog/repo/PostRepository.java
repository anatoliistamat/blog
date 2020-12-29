package com.anatoliistamat.blog.repo;

import com.anatoliistamat.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository <Post, Long> {
}
