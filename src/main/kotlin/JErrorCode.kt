enum class JErrorCode(
    message: String,
    status: Int
) {
    // 400 ~
    BAD_REQUEST_J("Bad Request J", 400),
    UNAUTHORIZED_J("Unauthorized J" , 401),
    FORBIDDEN_J("Forbidden J", 403),
    NOT_FOUND_JJ("Not Found JJ", 404),

    // 500
    JNTERNAL_SERVER_ERROR("Jnternal Server Error", 500),
    BAD_JATEWAY("Bad Jateway Error", 503)

}