package com.junyharang.mybatis.mybatispagingtest;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

/**
 * HTTP Response Default Class
 * <pre>
 * <b>History:</b>
 * @author 주니하랑
 * @version 1.0.0, 2022.06.18 최초 작성
 */

@Getter
@Setter
public class CustomBaseResponse<T> {
    private int errorCode;              // 문제 발생 시 반환될 Code (문제 없을 시 0)
    private String title;               // 응답 제목
    private String message;             // 응답 내용
    @Nullable
    private T data;                     // 응답과 함께 전달될 객체

    public CustomBaseResponse() {
        this.errorCode = 0;
    }

    public boolean isSuccess() {
        return this.errorCode == 0;
    }

    public static CustomBaseResponse<Void> ok() {
        return ok(null);
    }

    public static <T> CustomBaseResponse<T> ok(T data) {
        CustomBaseResponse<T> response = new CustomBaseResponse<>();
        response.setData(data);
        response.setTitle("");
        response.setMessage("");
        return response;
    } // ok(T data) 끝

    public static CustomBaseResponse<Void> error(int errorCode, String title, String message) {
        CustomBaseResponse<Void> response = new CustomBaseResponse<>();
        response.setTitle(title);
        response.setMessage(message);
        response.setErrorCode(errorCode);
        return response;
    } // error(int errorCode, String title, String message) 끝
} // class 끝
