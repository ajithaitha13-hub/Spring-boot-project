package com.example.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
    private Computer comp;

    public void build(){

        comp.compile();
        System.out.println("working on Awesome Project");
    }
}
