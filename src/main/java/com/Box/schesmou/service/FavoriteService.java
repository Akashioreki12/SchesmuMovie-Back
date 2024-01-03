package com.Box.schesmou.service;

import com.Box.schesmou.model.Favorite;

import java.util.List;

public interface FavoriteService {
    List<Favorite> getAllFavorites();
    Favorite getFavoriteById(Long id);
    Favorite saveFavorite(Favorite favorite);
    void deleteFavorite(Long id);
}
