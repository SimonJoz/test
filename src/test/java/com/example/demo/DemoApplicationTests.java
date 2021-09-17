package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private DemoApplication demoApplication;

    @Test
    void contextLoads() {
    }

    @Test
    void testHelloSuccess() {
        assertEquals("Hello1", demoApplication.hello());
    }
}
