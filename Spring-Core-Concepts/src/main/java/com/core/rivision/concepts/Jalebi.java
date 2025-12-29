package com.core.rivision.concepts;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("jalebi1")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)//@Scope annotation is used to define the scope of a bean
public class Jalebi {
    public Jalebi(){
        System.out.println(("Jalebi is created"));
    }

    public void eat(){
        System.out.println("Eating Jalebi");
    }
}

