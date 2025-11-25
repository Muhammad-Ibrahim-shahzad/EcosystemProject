package com.ecosystem.app.entities;

public abstract class Animal {

    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract void move();
    public abstract void eat();

    public String toString(){
        return "Name: "+name+
                "\nAge: "+age;
    }
}
