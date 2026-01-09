package com.jpa.app.jpa_app;

import com.jpa.app.jpa_app.Entity.Users;
import com.jpa.app.jpa_app.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaAppApplication  implements org.springframework.boot.CommandLineRunner {


	private UserService userService;

	@Autowired
	public JpaAppApplication(UserService userService) {
		this.userService=userService;
	}
	public static void main(String[] args) {

		var context=SpringApplication.run(JpaAppApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Application started successfully.");
		 Users user1=new Users();
		 user1.setUserId(1);
		 user1.setUserName("John Doe");
		 user1.setEmail("1234@dev.in");

		 userService.saveUser(user1);
		}

}
