package com.codeup.springframeworkproject.repositories;

import com.codeup.springframeworkproject.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Integer>{
//    Post findByTitle(String title);
}
