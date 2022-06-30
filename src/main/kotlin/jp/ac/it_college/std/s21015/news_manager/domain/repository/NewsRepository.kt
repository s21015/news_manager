package jp.ac.it_college.std.s21015.news_manager.domain.repository

import jp.ac.it_college.std.s21015.news_manager.domain.model.News
import jp.ac.it_college.std.s21015.news_manager.domain.model.NewsWithCategory
import java.time.LocalDateTime

interface NewsRepository {
    fun findAllWihCategory(): List<NewsWithCategory>

    fun findWithCategory(id: Long): NewsWithCategory?

    fun register(news: News)

}