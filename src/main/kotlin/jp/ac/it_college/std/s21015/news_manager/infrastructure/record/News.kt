/*
 * Auto-generated file. Created by MyBatis Generator
 */
package jp.ac.it_college.std.s21015.news_manager.infrastructure.record

import java.time.LocalDateTime
import java.util.Date

data class News(
    var id: Long? = null,
    var title: String? = null,
    var categoryId: Long? = null,
    var publishAt: Date? = null,
    var createAt: Date? = null,
    var userId: Long? = null,
    var body: String? = null,
    var name: String? = null
)