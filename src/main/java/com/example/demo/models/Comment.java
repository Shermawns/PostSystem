package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@Entity
@Table(name = "TB_COMMENT")
public class Comment {

    @Id
    private String id;
    private String text;
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "post_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Post post;

    @ManyToOne
    @JoinColumn(name = "author_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private User author;

    public Comment(String id, String text, LocalDate date) {
        this.id = id;
        this.text = text;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Post getPost() { // Corrigir nome do método
        return post;
    }

    public void setPost(Post post) { // Adicionar setter
        this.post = post;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) { // Adicionar setter
        this.author = author;
    }
}
