package com.core.rivision.concepts;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class Car implements InitializingBean , DisposableBean {


   Engine engine;// Dependency Declaration

    @Autowired
    private String name;

    public Car(Engine engine){
        this.engine = engine; // Dependency Injection via Constructor
    }

    public Car(){
        System.out.println("1. Bean is instantiated - default constructor called");
        //default constructor, used by spring container to instantiate the object, when we use property tag in xml
    }

    public Engine getEngine() {
        return engine;
    }

    public String getName() {
        return name;
    }

    public Car(Engine engine, String name){
        System.out.println("2. Dependencies are injected via parameterized constructor, because of @Autowired annotation");
        this.engine = engine; // Dependency Injection via Constructor
        this.name=name;
    }


   @Autowired
   public void setEngine(Engine engine){
        System.out.println("2. Dependencies are injected via setter method, because of @Autowired annotation");
        this.engine=engine;// Dependency Injection via Setter, spring container will call this method to inject the dependency, when using xml property tag
    }

    @Autowired
    public void setName(String name) {
        this.name = name;
    }

    public void startCar(){
        //System.out.println("Starting Car...");
        //engine = new Engine();// Dependency Creation
       // engine.startEngine();
       // System.out.println("Car Started");
    }

    //Bean Lifecycle
    /*
    1. Bean is instantiated
    2. Dependencies are injected
    3. init() method is called we can also use @PostConstruct annotation for this purpose
    4. Bean is ready to use -> getBean()
    5. destroy() method is called we can also use @PreDestroy annotation for this purpose
    6. Bean is removed from memory
    */


    @Override //this method acr=t as an init() method, called after the properties are set
    //
    public void afterPropertiesSet(){
        System.out.println("at stage 2 depencencies are injected");
        System.out.println("car name is: "+name);
        System.out.println("3. Init method called - Car bean is initializing...");
        System.out.println("we can have our custom initialization logic here");
        this.name = name + " - Initialized";
        System.out.println("we have changed the car name in init method to: "+this.name);

    }

    @Override
    public void destroy(){
        System.out.println("5. Destroy method called - Car bean is being destroyed...");
        System.out.println("we can have our custom cleanup logic here");
        this.name = null;
    }
}
