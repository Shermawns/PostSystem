package com.example.demo.services;

import com.example.demo.models.Comment;
import com.example.demo.models.Post;
import com.example.demo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> findAll(){
        return commentRepository.findAll();
    }

    public Comment findById(String id){
        Optional<Comment> obj = commentRepository.findById(id);
        return obj.get();
    }

    public Comment insert (Comment obj){
        return commentRepository.save(obj);
    }
}
