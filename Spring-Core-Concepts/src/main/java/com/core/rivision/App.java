package com.core.rivision;

import com.core.rivision.concepts.Car;
import com.core.rivision.concepts.Engine;
import com.core.rivision.concepts.Fuel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        Fuel petrol= new Fuel();
//        Engine bmw1= new Engine(petrol);
//        Car car = new Car(bmw1);
//        car.startCar();

//        //from now on we will use spring container to create and manage objects for us
//        ApplicationContext context = new ClassPathXmlApplicationContext( "config.xml");
//        //the container reads the config from the xml file
//
//        //ApplicationContext is of type interface which extends many other interfaces like Bean Factory and classpath is an implemented class.
//
//       //so the container contains the beans specified in xml , so we  will get by asking the container
////        Engine engine = context.getBean("engine", Engine.class);
////        engine.startEngine();
//
//        context.getBean("car", Car.class).startCar();

        /*
        now we will do java based configuration instead of xml based configuration.
        1. create a configuration class with @Configuration annotation
           @Configuration : it is a class level annotation which indicates that the class can be used by the spring IoC container as a source of bean definitions.
           @ComponentScan : it is used to specify the base packages to scan for annotated components.
        2.and define @Component annotation on the classes which we want to be managed by spring container instead of defining beans in xml file.
           @Component : it is a class level annotation which indicates that the class is a candidate for component scanning and automatic detection by the spring container.
         */

        ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
      //  context.getBean("fuel", Fuel.class).useFuel();
        context.getBean("car", Car.class).startCar();

    }
}
