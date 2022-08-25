package com.TestProject.Hello;

public class Cat extends Animal implements IPetAble, IFly{

    public Cat(String picture, String name, int age, String wagTail, double treats){
        super(picture, name, age, wagTail, treats);
    }


    //Overrides the AnimalTalk() method in Animal class. This(cat) class just extends animal.
    @Override
    public void AnimalTalk() {
        System.out.println(this.name + " just meowed.");
    }

    //Since class extends Animal,
    // It must implement a makeSound() function as it has to be implemented in order to inhereit the Animal class.
    @Override
    public void makeSound() {

    }

    //INTERFACE, forces class to have attributes.
    @Override
    public void pet() {
        System.out.println("Petted " + this.name);
    }

    @Override
    public void fly() {
        System.out.println(this.name + " cannot fly.");
    }
}
