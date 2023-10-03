package com.niklas.models;


//
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
