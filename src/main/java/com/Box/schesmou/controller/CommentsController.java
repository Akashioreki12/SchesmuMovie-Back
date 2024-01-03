package com.Box.schesmou.controller;

import com.Box.schesmou.model.Comments;
import com.Box.schesmou.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
@CrossOrigin(origins = "http://localhost:4200")
public class CommentsController {

    private final CommentsService commentsService;

    @Autowired
    public CommentsController(CommentsService commentsService) {
        this.commentsService = commentsService;
    }

    @GetMapping
    public ResponseEntity<List<Comments>> getAllComments() {
        List<Comments> comments = commentsService.getAllComments();
        return ResponseEntity.ok(comments);
    }

    @GetMapping("/movie/{movieId}")
    public ResponseEntity<List<Comments>> getCommentsByMovieId(@PathVariable Long movieId) {
        List<Comments> comments = commentsService.getCommentsByMovieId(movieId);
        return ResponseEntity.ok(comments);
    }

    @PostMapping
    public ResponseEntity<Comments> addComment(@RequestBody Comments comments) {
        Comments savedComment = commentsService.saveComments(comments);
        return ResponseEntity.ok(savedComment);
    }

    // Other CRUD operations...

}
