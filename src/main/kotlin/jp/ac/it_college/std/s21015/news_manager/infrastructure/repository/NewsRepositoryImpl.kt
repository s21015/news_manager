package jp.ac.it_college.std.s21015.news_manager.infrastructure.repository

import jp.ac.it_college.std.s21015.news_manager.domain.model.Category
import jp.ac.it_college.std.s21015.news_manager.domain.model.News
import jp.ac.it_college.std.s21015.news_manager.infrastructure.record.NewsWithCategory
import jp.ac.it_college.std.s21015.news_manager.domain.repository.NewsRepository
import jp.ac.it_college.std.s21015.news_manager.infrastructure.database.mapper.NewsWithCategoryMapper
import jp.ac.it_college.std.s21015.news_manager.infrastructure.database.mapper.select
import org.springframework.stereotype.Repository
import jp.ac.it_college.std.s21015.news_manager.domain.model.NewsWithCategory as ModelNewsWithCategory
import jp.ac.it_college.std.s21015.news_manager.infrastructure.record.News as RecordNews

@Repository
class NewsRepositoryImpl(
    private val newsWithCategoryMapper: NewsWithCategoryMapper,
) : NewsRepository {
    override fun findAllWihCategory(): List<ModelNewsWithCategory> {
        return newsWithCategoryMapper.select {  }.map { toModel(it) }
    }

    private fun toModel(record: NewsWithCategory): ModelNewsWithCategory {
        val news = News(
            record.id!!,
            record.title!!,
            record.categoryId!!,
            record.publishAt!!,
            record.createAt!!,
            record.userId!!,
            record.body!!,
            record.name!!
        )
        val category = record.id?.let {
            Category(
                record.id!!,
                record.name!!
            )
        }
        return ModelNewsWithCategory(news, category)
    }

    private fun toCategory(model: News): RecordNews {
        return RecordNews(model.id, model.title, model.categoryId, model.publishAt, model.createAt, model.userId, model.body)
    }
}