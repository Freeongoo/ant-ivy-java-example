package com.hello;

import static org.junit.Assert.assertEquals;

import com.hello.HelloWorld;
import org.junit.Test;

public class HelloWorldTest {
    @Test
    public void testHello() {
        HelloWorld hello = new HelloWorld();
        assertEquals("Hello, World!", hello.sayHello());
    }
}