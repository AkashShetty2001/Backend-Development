package com.core.rivision;

import com.core.rivision.concepts.Car;
import com.core.rivision.concepts.Engine;
import com.core.rivision.concepts.Fuel;
import org.springframework.context.ApplicationContext;
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

        //from now on we will use spring container to create and manage objects for us
        ApplicationContext context = new ClassPathXmlApplicationContext( "config.xml");
        //the container reads the config from the xml file

        //ApplicationContext is of type interface which extends many other interfaces like Bean Factory and classpath is an implemented class.

       //so the container contains the beans specified in xml , so we  will get by asking the container
        Fuel fuel=context.getBean("fuel", Fuel.class);
        fuel.useFuel();

    }
}
