package com.p5.adoptions.model;

public class Cat extends Animal
{
    Integer purrIntensity;
    public Cat(String name, String photo)
    {
        // Super is mandatory if we have a constructor with parameters in base class
        // must be on the first line of the child's constructor
        super(name, photo);
        System.out.println("Constructing a cat");
        this.purrIntensity = 5;
    }

    @Override
    public String makeSound() {
        return "Miau" + secondSound();
    }

    @Override
    public String whatDoesItEat() {
        return "Milk";
    }

    // Second example of polymorphism
    public String customMethodToCats(){
        return "Cats are cool, only cats can do this";
    }
    public String customMethodToCats(String message){
        return message;
    }
}
