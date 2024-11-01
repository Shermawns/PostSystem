package com.example.demo.services;

import com.example.demo.models.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public List<Post> findAll(){
        return postRepository.findAll();
    }

    public Post findById (String id){
        Optional<Post> obj = postRepository.findById(id);
        return obj.get();
    }

    public Post insert (Post obj){
        return postRepository.save(obj);
    }

    public void delete(String id){
        postRepository.deleteById(id);
    }
}
