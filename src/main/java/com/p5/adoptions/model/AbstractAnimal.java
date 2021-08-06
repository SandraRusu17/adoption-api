package com.p5.adoptions.model;

/*
 * An abstract class, cannot be instantiated anymore
 *
 * Pluses over interface:
 * - we can declare fields private static, non-static, protected
 * - we can have body to functions
 * - we can have abstract methods == interface methods
 * - constructors
 *
 * Minuses:
 * -IMPORTANT!!! Limits inheritance, because we need to extend this in child, and we can only extends once
 * */
public abstract class AbstractAnimal {
    /*
     * An abstract method doesn't have a body, and it makes the class to be also abstract
     * */
    public abstract String whatDoesItEat();
}
