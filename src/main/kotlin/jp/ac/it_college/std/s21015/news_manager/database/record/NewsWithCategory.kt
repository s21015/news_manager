package jp.ac.it_college.std.s21015.news_manager.database.record

import java.util.*

data class NewsWithCategory(
    var id: Long? = null,
    var title: String? = null,
    var categoryId: Long? = null,
    var publishAt: Date? = null,
    var creteAt: Date? = null,
    var userId: Long? = null,
    var body: String? = null,
    var name: String? = null
)