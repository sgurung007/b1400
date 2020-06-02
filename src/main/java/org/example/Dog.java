package org.example;

public class Dog implements Animal {
    @Override
    public void nameAnimal() {
        System.out.println("dog animal");
    }

    @Override
    public void typeAnimal() {
        System.out.println("dog type");
    }
    
    @Override
    public void weightAnimal() {
        System.out.println("dog weight");
    }
    
}
