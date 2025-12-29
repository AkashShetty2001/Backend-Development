package com.core.rivision;

import com.core.rivision.concepts.Car;
import com.core.rivision.concepts.Engine;
import com.core.rivision.concepts.Fuel;
import com.core.rivision.concepts.Jalebi;
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
       // context.getBean("car", Car.class).startCar();

//        System.out.println("4.At this point bean is ready to use");
//        Car car = context.getBean("car", Car.class);
//        System.out.println("Car Name: "+car.getName());

        /*
        Scope of Beans
        1.Singleton : only one instance of the bean is created and shared across the application. (default scope)
        used when we want to maintain a single state or configuration throughout the application.
        like utility classes, configuration classes , repositories etc.

        Jalebi jalebi1 = context.getBean("jalebi1", Jalebi.class);
        jalebi1.eat();

        Jalebi jalebi2 = context.getBean("jalebi1", Jalebi.class);
        jalebi2.eat();*/


        /*
        2.Prototype : a new instance of the bean is created every time it is requested from the container.
        used when we want to maintain separate state or configuration for each instance.
        used when we need a short life span bean like in case of session beans, request beans etc.

        spring container will not manage the complete lifecycle of a prototype bean.
        we manually need to destroy the prototype bean when it is no longer needed.
        it happens because each time a new instance is created so the container cannot keep track of all the instances created.


        Jalebi jalebi1 = context.getBean("jalebi1", Jalebi.class);
        jalebi1.eat();

        Jalebi jalebi2 = context.getBean("jalebi1", Jalebi.class);
        jalebi1.eat();*/

        /*
        3.Request Scope : a new instance of the bean is created for each HTTP request. used in web applications.
        //mainly in springBoot MVC applications.
        for each http request a new bean instance is created and destroyed once the request is completed.means when we serve the request and send the response back to the client.
         */

        /*
        4.Session Scope : a new instance of the bean is created for each HTTP session. used in web applications.
        used in springBoot MVC applications.
        session is basically a series of related requests from the same user or client.
        it is used to maintain user-specific data across multiple requests within the same session.it is related to time duration.
        so in container sessionInstance and also requestInstance will be created.if the user is communicating with the server.
        temporarily storage which keeps track of user activity.
         */



        //to close the context u should register shutdown hook
        ((AnnotationConfigApplicationContext)context).registerShutdownHook();



    }
}
