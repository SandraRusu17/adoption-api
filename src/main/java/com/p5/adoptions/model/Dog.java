package com.p5.adoptions.model;

public class Dog extends Animal
{
    public Dog(String name, String photo) {
        super(name, photo);
    }

    public Dog() {
    }

    @Override
    public String makeSound() {
        return "Ham";
    }

    @Override
    public String whatDoesItEat() {
        return "Bones";
    }

    @Override
    public String howManyLegs() {
        return "Four";
    }
}
