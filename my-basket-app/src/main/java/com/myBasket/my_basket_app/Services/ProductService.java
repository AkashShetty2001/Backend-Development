package com.myBasket.my_basket_app.Services;

import com.myBasket.my_basket_app.Entity.Product;
import com.myBasket.my_basket_app.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public void saveProduct(Product product){
        productRepository.save(product);
    }

    public void findByProductName(String name) {
        productRepository.findByProductNameContaining(name).forEach(product -> {
            System.out.println("Product found: " + product.getProductName() + " with ID: " + product.getProductId());
        });

    }

    public void findByProductIdAndProductNamecontaining(Long productId,String productName){
        productRepository.findByProductIdAndProductNameContaining(productId, productName).ifPresentOrElse(product-> {
            System.out.println("Product found: " + product.getProductId() + " name: " + product.getProductName());
             },
            ()->{
                System.out.println("No product found with the given ID and name.");
          });
    }

}
