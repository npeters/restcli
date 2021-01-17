package uos.dev.restcli

import okhttp3.logging.HttpLoggingInterceptor

enum class HttpLoggingLevel {
    NONE,
    BASIC,
    HEADERS,
    BODY,
    BODY_JSON,
}

fun HttpLoggingLevel.toOkHttpLoggingLevel(): HttpLoggingInterceptor.Level = when (this) {
    HttpLoggingLevel.NONE -> HttpLoggingInterceptor.Level.NONE
    HttpLoggingLevel.BASIC -> HttpLoggingInterceptor.Level.BASIC
    HttpLoggingLevel.HEADERS -> HttpLoggingInterceptor.Level.HEADERS
    HttpLoggingLevel.BODY -> HttpLoggingInterceptor.Level.BODY
    HttpLoggingLevel.BODY_JSON -> HttpLoggingInterceptor.Level.BODY
}
