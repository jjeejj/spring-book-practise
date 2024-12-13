package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response<T> {
    private int code;
    private boolean success;
    private T data;
    private String msg;

    public static <K> Response<K> newSuccess(K data) {
        Response<K> response = new Response<K>();
        response.setSuccess(true);
        response.setData(data);
        response.setMsg("");
        return response;
    }
}
