package com.caesar.springboot_demo;

import org.springframework.stereotype.Component;//import @Component

@Component//an annotation that makes the class as a spring-managed bean
public class HelloWorld{
    public String getHelloWorld(){
        return "Hello World!\n";
    }
}