package com.Box.schesmou.controller;

import com.Box.schesmou.model.Favorite;
import com.Box.schesmou.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/favorites")
public class FavoriteController {

    @Autowired
    private FavoriteService favoriteService;

    @GetMapping
    public List<Favorite> getAllFavorites() {
        return favoriteService.getAllFavorites();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Favorite> getFavoriteById(@PathVariable Long id) {
        Favorite favorite = favoriteService.getFavoriteById(id);
        return ResponseEntity.ok(favorite);
    }

    @PostMapping
    public ResponseEntity<Favorite> saveFavorite(@RequestBody Favorite favorite) {
        Favorite savedFavorite = favoriteService.saveFavorite(favorite);
        return new ResponseEntity<>(savedFavorite, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFavorite(@PathVariable Long id) {
        System.out.println("Received DELETE request for favorite with ID: " + id);
        favoriteService.deleteFavorite(id);
        System.out.println("Deletion completed for favorite with ID: " + id);
        return ResponseEntity.noContent().build();
    }

}
