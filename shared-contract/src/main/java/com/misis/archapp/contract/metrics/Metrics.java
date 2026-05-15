package com.misis.archapp.contract.metrics;

public abstract class Metrics {
    // Имя счетчика созданных пользователей
    public static final String USERS_CREATED_TOTAL = "users.new";

    // Имя метрики длительности запросов
    public static final String API_USER_REQ_DURATION = "api.user.request.duration";

    // Названия тегов и их значений
    public static final String METHOD_TAG = "method";
    public static final String POST_TAG_VAL = "post";
    public static final String GET_TAG_VAL = "get";
}