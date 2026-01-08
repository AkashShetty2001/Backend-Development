package com.spring_boot.spring_boot_example;

import com.spring_boot.spring_boot_example.Services.Impl.EmailService;
import com.spring_boot.spring_boot_example.Services.Impl.MailStrapService;
import com.spring_boot.spring_boot_example.Services.Impl.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootExampleApplication {

	public static void main(String[] args) {

		var context=SpringApplication.run(SpringBootExampleApplication.class, args);
		//from java 25 we can use var
		/*
		var : The var keyword in Java is used for local variable type inference.
		 It allows the compiler to automatically determine the type of local variable based on the value assigned to it.
		This feature was introduced in Java 10 to enhance code readability and reduce boilerplate code.
		it is not applicable for class fields, method parameters, or return types.
		 */
		//context.getBean("testController", TestController.class).test();
		var emailService = context.getBean(EmailService.class);
		emailService.SendEmail("akashkd9911@gmail.com,","Test Subject","This is a test email body");
		OrderService orderService = context.getBean("orderService", OrderService.class);
		orderService.sendInvoice();

	}


}
