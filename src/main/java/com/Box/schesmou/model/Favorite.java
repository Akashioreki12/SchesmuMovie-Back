package com.Box.schesmou.model;

import jakarta.persistence.*;

@Entity
@Table(name = "favorites")
public class Favorite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // private Long userId; // If needed, you can add userId to associate favorites with a specific user

    @Column(unique = true) // Ensures uniqueness for the movieId field
    private Long movieId;

    public Favorite(Long movieId) {
        this.movieId = movieId;
    }

    public Favorite() {
    }

    public Favorite(Long id, Long movieId) {
        this.id = id;
        this.movieId = movieId;
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
}
