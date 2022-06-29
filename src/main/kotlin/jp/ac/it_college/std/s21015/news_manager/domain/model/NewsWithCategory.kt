package jp.ac.it_college.std.s21015.news_manager.domain.model

data class NewsWithCategory(
    val news: News,
    val category: Category?
) {
    val isCategory: Boolean
    get() = category != null
}
