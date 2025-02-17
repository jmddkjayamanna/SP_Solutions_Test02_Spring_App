package com.example.news.repositroy;

import com.example.news.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository  extends JpaRepository<Comment, Long> {
    List<Comment> findByNewsId(Long newsId);
}
