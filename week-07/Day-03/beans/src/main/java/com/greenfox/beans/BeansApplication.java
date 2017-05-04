package com.greenfox.beans;

import com.greenfox.beans.helloworld.HelloWorld;
import com.greenfox.beans.helloworld.HelloWorldConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeansApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeansApplication.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				HelloWorldConfig.class);

		HelloWorld helloWorld = context.getBean(HelloWorld.class);
		helloWorld.setMessage("How you doin?");
		helloWorld.getMessage();
	}
}
