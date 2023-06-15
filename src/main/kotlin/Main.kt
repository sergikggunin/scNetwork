object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val socialNetworkRepository = SocialNetworkRepository()
        val userId = 1
        val user = User(1, "John", "avatar.png", "Some bio", "17.05.1998")
        val content = "Hello, world!"
        val createPostResponse = socialNetworkRepository.createPost(user, content)
        when (createPostResponse) {
            is ResultResponse.Success<*> -> {
                val post = createPostResponse.data as Post
                println("Post created:")
                println("Author: ${post.author.name}")
                println("Content: ${post.content}")
                println("Bio: ${post.author.bio}")
                println("Birthdate: ${post.author.birthdate}")
            }
            is ResultResponse.Failure -> {
                val exception = createPostResponse.exception
                println("Error occurred: ${exception.message}")
            }
            is ResultResponse.Loading -> {
                println("Loading...")
            }
        }
    }
}