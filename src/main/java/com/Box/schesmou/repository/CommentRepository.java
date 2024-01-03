package com.Box.schesmou.repository;

import com.Box.schesmou.model.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comments,Long> {
    List<Comments> findByMovieId(Long movieId);

}
