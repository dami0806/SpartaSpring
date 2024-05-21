package com.sparta.springauth.food;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

    @Autowired
    @Qualifier("pizza")
    Food food;

    @Test
    @DisplayName("Primary와 Quilifier 우선순위 확인")
    public void test() {
        food.eat();
    }
}
