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
    

    public void weightAnimal() {
        System.out.println("dog weight");
    }

    public void soundAnimal(){
        System.out.println("dog sound");
    }
    
     @Override
    public void colorAnimal() {
        System.out.println("dog color");
    }
    
    
}
