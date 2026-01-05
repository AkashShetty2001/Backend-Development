package com.spring_boot.spring_boot_example;

import com.spring_boot.spring_boot_example.Controller.TestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootExampleApplication {

	public static void main(String[] args) {

		var context=SpringApplication.run(SpringBootExampleApplication.class, args);
		context.getBean("testController", TestController.class).test();
	}


}
