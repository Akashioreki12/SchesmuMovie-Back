package com.Box.schesmou.service;

import com.Box.schesmou.model.Comments;
import com.Box.schesmou.repository.CommentRepository;
import com.Box.schesmou.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentsServiceImpl implements CommentsService {

    private final CommentRepository commentsRepository;

    @Autowired
    public CommentsServiceImpl(CommentRepository commentsRepository) {
        this.commentsRepository = commentsRepository;
    }

    @Override
    public List<Comments> getAllComments() {
        return commentsRepository.findAll();
    }

    @Override
    public List<Comments> getCommentsByMovieId(Long movieId) {
        return commentsRepository.findByMovieId(movieId);
    }

    @Override
    public Comments getCommentsById(Long commentId) {
        Optional<Comments> optionalComments = commentsRepository.findById(commentId);
        return optionalComments.orElse(null);
    }

    @Override
    public Comments saveComments(Comments comments) {
        return commentsRepository.save(comments);
    }

    @Override
    public void deleteComments(Long commentId) {
        commentsRepository.deleteById(commentId);
    }
}