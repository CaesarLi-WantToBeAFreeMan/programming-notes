package com.caesar.springboot_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import hello_world.HelloWorld;

@SpringBootApplication
public class Application{
	public static void main(String[] args){
		SpringApplication.run(Application.class, args);

		var helloWorld = new HelloWorld();
		System.out.println(helloWorld.getHelloWorld());
	}
}