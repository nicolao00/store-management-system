package edu.dongguk.cs25server.exception

enum class ErrorCode(
        private val code: String,
        private val message: String
) {
    // Not Found Error
    NOT_FOUND_ERROR("404", "찾을 수 없습니다."),
    NOT_FOUND_CUSTOMER("405", "사용자를 찾을 수 없습니다."),
    NOT_FOUND_MANAGER("406", "점주를 찾을 수 없습니다."),
    NOT_FOUND_ITEMCS("407", "상품이 존재하지 않습니다."),
    NOT_FOUND_STORE("408", "점포가 존재하지 않습니다."),

    // Bad Request Error
    NOT_ENOUGH_ERROR("400", "주문하신 상품의 재고가 부족합니다."),
    INVALID_ARGUMENT("401", "Invalid Argument"),
    WRONG_CATEGORY_ERROR("400", "알 수 없는 카테고리입니다."),

    SERVER_ERROR("500", "서버 내부 오류입니다."),

    NOT_END_POINT("400", "잘못된 요청입니다."),

    ACCESS_DENIED_ERROR("401", "접근 권한이 없습니다."),

    TOKEN_INVALID_ERROR("401", "유효하지 않은 토큰입니다."),

    TOKEN_MALFORMED_ERROR("401", "잘못된 토큰 입니다."),

    TOKEN_EXPIRED_ERROR("401", "만료된 토큰입니다."),

    TOKEN_TYPE_ERROR("401", "잘못된 형식의 토큰 입니다."),

    TOKEN_UNSUPPORTED_ERROR("401", "지원되지 않는 토큰입니다."),

    TOKEN_UNKNOWN_ERROR("401", "토큰 에러입니다."),

    DUPLICATION_MANAGER("505", "이미 존재하는 점주입니다"),
    DUPLICATION_STORE("506", "이미 존재하는 점포입니다");

    fun getCode() = this.code
    fun getMessage() = this.message
}