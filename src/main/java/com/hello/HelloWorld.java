package com.hello;

public class HelloWorld {
    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        System.out.println(hello.sayHello());
    }
    protected String sayHello() {
        return "Hello, World!";
    }
}