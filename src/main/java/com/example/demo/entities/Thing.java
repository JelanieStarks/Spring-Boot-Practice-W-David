package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Thing {
    private String name;
    private int number;

    @Id
    @GeneratedValue
    private Long id;

    public Thing(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Thing() {

    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;

    }
}
