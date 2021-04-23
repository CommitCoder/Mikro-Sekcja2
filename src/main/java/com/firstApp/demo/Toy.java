package com.firstApp.demo;

import org.springframework.stereotype.Component;

@Component
public class Toy {
    private Long id;
    private String name;

    public void play(){
        System.out.println(" Let's play");
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
