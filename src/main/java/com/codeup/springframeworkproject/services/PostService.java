package com.codeup.springframeworkproject.services;

import com.codeup.springframeworkproject.models.Post;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private List<Post> posts;

    public PostService() {
        posts = new ArrayList<>();
        createPosts();
    }

    public List<Post> allPosts() {
        return posts;
    }

    public void create(Post post) {
        post.setId(posts.size()+1);
        posts.add(post);
    }

    public Post getPostById(int id) {
        return posts.get(id-1);
    }

    public void createPosts() {
        create(new Post("New post 1", "lorem impsum dolor set amit", 0));
        create(new Post("New post 2", "lorem impsum dolor set amit", 0));
        create(new Post("New post 3", "lorem impsum dolor set amit", 0));
        create(new Post("New post 4", "lorem impsum dolor set amit", 0));
        create(new Post("New post 5", "lorem impsum dolor set amit", 0));
    }

}
