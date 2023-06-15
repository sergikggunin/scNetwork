// ResultResponse.kt

sealed class ResultResponse {
    data class Failure(val exception: Exception) : ResultResponse()
    data class Success<T>(val data: T) : ResultResponse()
    object Loading : ResultResponse()
}
