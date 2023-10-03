package com.niklas.models;

// Abstract class - marked by keyword: abstract
// Can inherit from both Interface and Abstract classes
public abstract class AAnimal {

    // Includes abstract, excludes body: {}
    public abstract void eats();


    // Ordinary method
    public void makeSound() {
        System.out.println("Some random animal noise");
    }

}
