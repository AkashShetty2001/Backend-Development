package com.springBoot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
/*
@Controller is an annotation used in Spring Framework to indicate that a particular class serves the role of a controller in the Model-View-Controller (MVC) pattern. Controllers are responsible for handling incoming HTTP requests, processing them (often by interacting with the service layer), and returning appropriate responses, which may include rendering views or returning data.
 */
/*
Annotations are basically used to provide metadata about the program. They are a form of syntactic metadata that can be added to Java source code. Annotations can be applied to classes, methods, fields, parameters, and other program elements to convey additional information to the compiler or runtime environment.
in this case it is give info to spring framework that this class is a controller class
 */
/*
The layered approach of web Application in Spring Framework is as follows:
1. Controller Layer: This layer handles incoming HTTP requests, processes them, and returns appropriate responses. It acts as an intermediary between the client and the service layer.
2. Service Layer: This layer contains the business logic of the application. It processes data, applies business rules, and interacts with the data access layer to retrieve or store information.
3. Data Access Layer (Repository Layer): This layer is responsible for interacting with the database or other data sources. It performs CRUD (Create, Read, Update, Delete) operations and abstracts the data access logic from the service layer.
 */
@RequestMapping
public class HomeController {

    @RequestMapping(value = "/home",produces = {"text/plain"})
    /*
    produces attritube is used to specify the media types that the method can produce as a response. In this case, it indicates that the method will return plain text (text/plain) as the response content type.
    like this we can send json also by using produces = {"application/json"}
    for pdf we can use produces = {"application/pdf"}
    even we can send html by using produces = {"text/html"}
     */
    /*
    @RequestMapping is an annotation used in the Spring Framework to map HTTP requests to specific handler methods or classes within a controller. It is a versatile and powerful annotation that allows developers to define how incoming requests should be routed and processed.
     */
   // @ResponseBody
    /*
    @ResponseBody is an annotation used in the Spring Framework to indicate that the return value of a method should be bound directly to the HTTP response body. It is typically used in RESTful web services and APIs to send data (such as JSON or XML) back to the client without rendering a view.
    so it doesn't send a page but sends the data directly to client
     */
    public String home(Model model){
        /*
        Model is an interface in the Spring Framework that is used to pass data between the controller and the view in a web application. It acts as a container for attributes that need to be made available to the view for rendering. The Model interface is part of the Spring MVC (Model-View-Controller) architecture, which separates the application's concerns into three main components: the model (data), the view (presentation), and the controller (business logic).
        so at runtime the container will create an object of Model implemented class and will pass it to this method
         */
        System.out.println(
            "This is home controller method - home()"
        );
        String tagLine = "learn by coding";
        model.addAttribute("tagLine",tagLine);
        return "home";
    }

    @RequestMapping(value = "/about",produces = "text/html")
   // @ResponseBody
    /*
    if sending a page as a response then no need of @ResponseBody,
    then u should create a folder named 'templates' inside resources folder and
    put the html file inside that folder
    and return name of that html file without .html extension
     */
    public String about(){
        System.out.println("This is about controller method - about()");
        return "about";
    }

    @RequestMapping(value = "/services",produces="text/html")
    //@ResponseBody
    public String services(){
        System.out.println("This is services controller method - services()");
        return "services";
    }

}
