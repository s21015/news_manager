package jp.ac.it_college.std.s21015.news_manager.presentation.form

import jp.ac.it_college.std.s21015.news_manager.domain.model.NewsWithCategory
import java.util.*

data class GetNewsListResponse(val newsList: List<NewsInfo>)

data class NewsInfo(
    val id: Long,
    val title: String,
    val categoryId: Long,
    val publishAt: Date,
    val createAt: Date,
    val userId: Long,
    val body: String,
    val name: String
    ){
    constructor(model: NewsWithCategory) : this(
        model.news.id, model.news.title, model.news.categoryId, model.news.publishAt, model.news.createAt, model.news.userId, model.news.body, model.news.name
    )
}