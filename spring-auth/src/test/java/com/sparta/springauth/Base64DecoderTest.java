package com.sparta.springauth;

import java.util.Base64;

public class Base64DecoderTest {
    public static void main(String[] args) {
        String secretKey = "7Iqk7YyM66W07YOA7L2U65Sp7YG065+9U3ByaW5n6rCV7J2Y7Yqc7YSw7LWc7JuQ67mI7J6F64uI64ukLg==";
        try {
            byte[] decodedKey = Base64.getDecoder().decode(secretKey);
            System.out.println("디코딩 성공: " + new String(decodedKey));
        } catch (IllegalArgumentException e) {
            System.err.println("디코딩 실패: " + e.getMessage());
        }
    }
}
