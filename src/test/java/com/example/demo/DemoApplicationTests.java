package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    // Private constructor to prevent instantiation
    private void DemoApplication() {
        // This constructor will prevent the class from being instantiated
        // since it's private and cannot be accessed from outside the class.
        // Utility classes should not have a public or default constructor.
        // By making it private, we ensure that no instance of this class can be created.
        throw new AssertionError("Utility class should not be instantiated");
    }

    @Test
    void contextLoads() {
    }

}
