package com.practice.javapracticeboard.repository;

import com.practice.javapracticeboard.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
