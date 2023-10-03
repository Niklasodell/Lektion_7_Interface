package com.niklas.models;

public class Cat implements Animal {

    @Override
    public void name() {
        System.out.println("Kasper");
    }

    @Override
    public void move() {
        System.out.println("Moves graicously");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeps 80% of the time");
    }

    @Override
    public void eat() {
        System.out.println("Omnom nom nom");
    }

    @Override
    public void makeSound() {
        System.out.println("Mjau");
    }
}
