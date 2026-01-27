package com.myBasket.my_basket_app;

import com.myBasket.my_basket_app.Entity.Product;
import com.myBasket.my_basket_app.Entity.Users;
import com.myBasket.my_basket_app.Repository.CategoryRepository;
import com.myBasket.my_basket_app.Repository.ProductRepository;
import com.myBasket.my_basket_app.Services.CategoryService;
import com.myBasket.my_basket_app.Services.ProductService;
import com.myBasket.my_basket_app.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
/*
@EnableJpaAuditing is used to enable JPA Auditing in a Spring Boot application. JPA Auditing provides a way to automatically populate certain fields in your entity classes, such as createdAt and updatedAt, with timestamps when the entity is created or modified.
 */
public class MyBasketAppApplication implements CommandLineRunner {
	private final UserService userService;
	private final ProductService productService;
	private final CategoryService categoryService;

	@Autowired
	public MyBasketAppApplication(UserService userService, ProductService productService, CategoryService categoryService)
		{
			this.userService = userService;
			this.productService = productService;
			this.categoryService = categoryService;
		}

		public static void main (String[]args){
			var context = SpringApplication.run(MyBasketAppApplication.class, args);

		}

		@Override
		public void run (String...args) throws Exception {
			System.out.println("Application started successfully.");

		Users user1=new Users();
		user1.setUserName("John Doe");
		user1.setEmail("1234@devv.in");

		userService.saveUser(user1);

			userService.deleteUserById(1);


			/*var products1 = new Product();
			//products1.setProductId(1l);
			products1.setProductName("Apple iPhone 13");
			products1.setPrice(999.99);
			products1.setDescription("Latest Apple iPhone with A15 Bionic chip");
			products1.setShortDescription("Apple iPhone 13");
			products1.setLive(true);
			products1.setStock(true);*/

			/*productService.saveProduct(products1);
			System.out.println("Product saved with ID: " + products1.getProductId());*/

			/*var products2 = new Product();
			products2.setProductName("Samsung Galaxy S21");
			products2.setPrice(799.99);
			products2.setDescription("Latest Samsung Galaxy with Exynos 2100");
			products2.setShortDescription("Samsung Galaxy S21");
			products2.setLive(true);
			products2.setStock(true);*/

			/*
			productService.saveProduct(products2);
			System.out.println("Product saved with ID: " + products2.getProductId());*/

			/*productService.findByProductName("iPhone");
			productService.findByProductIdAndProductNamecontaining(2l,"Samsung Galaxy S21");
			productService.getAllProducts().forEach(product -> {
				System.out.println("Product Id:"+ product.getProductId()+" Name:"+ product.getProductName());
			});*/




		}


}
