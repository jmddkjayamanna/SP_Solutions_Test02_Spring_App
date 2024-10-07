package com.example.news.service;

import com.example.news.model.Comment;
import com.example.news.model.News;
import com.example.news.repositroy.CommentRepository;
import com.example.news.repositroy.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private NewsRepository newsRepository;

    public Comment saveComment(Long newsId, Comment comment) {
        News news = newsRepository.findById(newsId)
                .orElseThrow(() -> new RuntimeException("News not found"));
        comment.setNews(news);
        return commentRepository.save(comment);
    }

    public List<Comment> getCommentsByNewsId(Long newsId) {
        return commentRepository.findByNewsId(newsId);
    }
}
