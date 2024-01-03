package com.Box.schesmou.service;

import com.Box.schesmou.model.Favorite;
import com.Box.schesmou.repository.FavoriteRepository;
import com.Box.schesmou.service.FavoriteService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FavoriteServiceImpl implements FavoriteService {

    @Autowired
    private FavoriteRepository favoriteRepository;

    @Override
    public List<Favorite> getAllFavorites() {
        return favoriteRepository.findAll();
    }

    @Override
    public Favorite getFavoriteById(Long id) {
        Optional<Favorite> optionalFavorite = favoriteRepository.findById(id);
        return optionalFavorite.orElse(null);
    }

    @Override
    public Favorite saveFavorite(Favorite favorite) {
        return favoriteRepository.save(favorite);
    }

    @Override
    @Transactional
    public void deleteFavorite(Long id) {
        favoriteRepository.deleteById(id);
    }

}
