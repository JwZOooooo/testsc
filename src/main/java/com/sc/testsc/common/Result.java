package com.sc.testsc.common;

public class Result {
    private static final String DEFAULT_SUCCESS_MESSAGE = "操作成功";
    private static final String DEFAULT_ERROR_MESSAGE = "操作失败";

    private boolean success;
    private String message;
    private Object data;

    private Result(boolean success, String message, Object data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public static Result success() {
        return success(DEFAULT_SUCCESS_MESSAGE);
    }

    public static Result success(String message) {
        return new Result(Boolean.TRUE, message, null);
    }

    public static Result success(Object data) {
        return success(null, data);
    }

    public static Result success(String message, Object data) {
        return new Result(Boolean.TRUE, message, data);
    }

    public static Result failure() {
        return failure(DEFAULT_ERROR_MESSAGE);
    }

    public static Result failure(String message) {
        return new Result(Boolean.FALSE, message, null);
    }

    public static Result failure(Object data) {
        return failure(null, data);
    }

    public static Result failure(String message, Object data) {
        return new Result(Boolean.FALSE, message, data);
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Result [success=" + success + ", message=" + message + ", data=" + data + "]";
    }

}
