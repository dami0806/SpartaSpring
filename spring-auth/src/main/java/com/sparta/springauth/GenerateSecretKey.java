package com.sparta.springauth;
import java.util.Base64;
import java.security.Key;
import javax.crypto.KeyGenerator;

public class GenerateSecretKey {
    public static void main(String[] args) {
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance("HmacSHA256");
            keyGen.init(256); // 키 크기 설정 (예: 256비트)
            Key key = keyGen.generateKey();
            String base64Key = Base64.getEncoder().encodeToString(key.getEncoded());
            System.out.println("새로운 Base64 Secret Key: " + base64Key);
        } catch (Exception e) {
            System.err.println("키 생성 실패: " + e.getMessage());
        }
    }
}

