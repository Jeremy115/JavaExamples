package com.TestProject.Hello;

public class Bird extends Animal implements IFly, IPetAble{

    public Bird(String picture, String name, int age, String wagTail, double treats) {
        super(picture, name, age, wagTail, treats);
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " just chirped.");
    }

    //INTERFACE, forces class to have attributes.
    @Override
    public void fly() {
        System.out.println(this.name + " flied");
    }

    @Override
    public void pet() {
        System.out.println(this.name + " was petted.");
    }
}
