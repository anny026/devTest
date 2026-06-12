package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void testApp() {
        // Простейший тест, который проверит CI/CD пайплайн
        String expected = "Hello World 1";
        assertEquals("Hello World 1", expected);
    }
}



