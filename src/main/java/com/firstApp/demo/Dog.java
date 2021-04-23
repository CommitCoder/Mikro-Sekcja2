package com.firstApp.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Dog {
    private Long id;
    private String name;

    @Autowired
    private Toy toy;

    public Dog() {
        System.out.println("Creating a dog");
    }

    public void sayHello(){
        System.out.println("Hello");
        toy.play();
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

    public Toy getToy() {
        return toy;
    }

    public void setToy(Toy toy) {
        this.toy = toy;
    }
}
