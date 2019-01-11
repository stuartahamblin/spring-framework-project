package com.codeup.springframeworkproject.services;

import com.codeup.springframeworkproject.models.Post;
import com.codeup.springframeworkproject.repositories.PostRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private final PostRepository postDao;

    public PostService(PostRepository postDao) {
        this.postDao = postDao;
    }

    public List<Post> allPosts() {
        return (List<Post>) postDao.findAll();
    }

    public Post getPostById(int id){
        return postDao.findOne(id);
    }

    public void create(Post post) {
        postDao.save(post);
    }


    public void edit(Post post) {
        postDao.save(post);
    }

}
