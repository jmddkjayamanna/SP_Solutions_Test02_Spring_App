package com.example.news.service;

import com.example.news.model.News;
import com.example.news.repositroy.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {

    @Autowired
    private NewsRepository newsRepository;

    public List<News> getAllNews() {
        return newsRepository.findAll();
    }

    public News saveNews(News news) {
        return newsRepository.save(news);
    }

    public List<News> getNewsByCategory(String categoryName) {
        return newsRepository.findByCategoriesName(categoryName);
    }

}
