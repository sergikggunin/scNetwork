class SocialNetworkRepository {
    fun getUserById(userId: Int): ResultResponse {
        // Здесь ваша реализация получения пользователя по идентификатору
        // Вернуть соответствующий ResultResponse, например:
        return ResultResponse.Success(User(1, "John", "avatar.png","Some bio", "17.05.1998"))
    }

    fun getPostsByUser(user: User): ResultResponse {
        // Здесь ваша реализация получения списка постов, опубликованных пользователем
        // Вернуть соответствующий ResultResponse, например:
        return ResultResponse.Success(listOf(
            Post(1, user, "Post 1"),
            Post(2, user, "Post 2")
        ))
    }
    fun createPost(user: User, content: String): ResultResponse {
        // Создание нового объекта Post
        val post = Post(1, user, content)

        // Возвращение Success с объектом Post
        return ResultResponse.Success(post)
    }

    // Другие методы репозитория...

    fun getFriends(user: User): ResultResponse {
        // Здесь ваша реализация получения списка всех друзей пользователя
        // Вернуть соответствующий ResultResponse, например:
        return ResultResponse.Success(listOf(
            User(2, "Alice", "avatar.png","sjsjssj", "17.05.1998"),
            User(3, "Bob", "avatar.png", "skjskssk", "17.05.1998")
        ))
    }
}
