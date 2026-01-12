package com.myBasket.my_basket_app.Repository;

import com.myBasket.my_basket_app.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    /*During runtime Spring Data JPA will provide the implementation for this interface,
    using proxy patterns to create a class that implements the interface and handles the data access logic.
     */

    /*
    we will get all basic CRUD operations for free, such as:
    - save(S entity): Saves a given entity.
    - findById(ID id): Retrieves an entity by its id.
    - findAll(): Returns all instances of the type.
     */

    /*
    we can implement custom query methods by defining method signatures that follow Spring Data JPA's naming conventions.
     */

    List<Product> findByProductNameContaining(String name);
    Optional<Product> findByProductIdAndProductNameContaining(Long productId,String productName);

    /*
     so we have predefined methoods to handle all type of database operations without writing any SQL queries or implementation code.

     if we need more complex queries, we can use JPQL or native SQL queries by annotating methods with @Query.
     */

    @Query("SELECT p FROM Product p")
    /*
    in jpql we use entity names and their attributes instead of table names and columns.
     */
    List<Product> getAllProducts();

    /*
    we can also use Native SQL queries like this:
    @Query(value = "SELECT * FROM `my-basket-products`", nativeQuery = true)
    @NativeQuery("SELECT * FROM `my-basket-products`")
    List<Product> getAllProducts();
    these are database specific and may not be portable across different database systems.
     */


}
