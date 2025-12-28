package com.core.rivision;

import com.core.rivision.concepts.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@org.springframework.context.annotation.Configuration
@ComponentScan(basePackages = {"com.core.rivision.concepts"})
public class Configuration {

   @Bean // defining a bean of type Student, it like manually registering the bean in the container
   // used mainly like in situations where we don't have control over the class to add @Component annotation
   public Student getStudent(){
        return new Student();
    }

    @Bean
    public String carName(){
        return "BMW";
    }
}
