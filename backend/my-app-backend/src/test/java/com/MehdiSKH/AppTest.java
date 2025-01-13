package com.MehdiSKH;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testHelloWorld() {
        App app = new App();
        String result = app.helloWorld();
        assertEquals("Hello, World!", result);
    }
}
