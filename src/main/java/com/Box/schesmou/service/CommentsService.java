package com.Box.schesmou.service;

import com.Box.schesmou.model.Comments;

import java.util.List;

public interface CommentsService {

        List<Comments> getAllComments();

    List<Comments> getCommentsByMovieId(Long movieId);


    Comments getCommentsById(Long movieId);

        Comments saveComments(Comments comments);

        void deleteComments(Long movieId);
    }

