// Comment.kt

data class Comment(
    val id: Int,
    val post: Post,
    val author: User,
    val content: String
)
