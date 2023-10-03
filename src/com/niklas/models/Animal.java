package com.niklas.models;


// Abstract - Inheritance
// As a Standard, methods are 'PUBLIC'
// Uses keyword: implements
public interface Animal {

    // TODO - SUPER VIKTIGT: private vis/mod


    // Abstract Method
    void name();
    void move();
    void sleep();
    void eat();
    void makeSound();

    // Default
    default void typeOfAnimal(String typOfAnimal) {
        System.out.println(typOfAnimal);
    }

}
