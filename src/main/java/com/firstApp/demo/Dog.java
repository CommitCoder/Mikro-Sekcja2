package com.firstApp.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Dog {
    private Long id;
    private String name;

    public Dog() {
        System.out.println("Creating a dog");
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
