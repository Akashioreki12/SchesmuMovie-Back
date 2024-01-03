package com.Box.schesmou.model;

import jakarta.persistence.*;

@Entity
    @Table
    public class Comments {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "movie_id")
        private Long movieId;

        private String name;
        private String email;
        private String comment;

    public Comments() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Comments(Long id, Long movieId, String name, String email, String comment) {
        this.id = id;
        this.movieId = movieId;
        this.name = name;
        this.email = email;
        this.comment = comment;
    }

    public Comments(Long movieId, String name, String email, String comment) {
        this.movieId = movieId;
        this.name = name;
        this.email = email;
        this.comment = comment;
    }
}

