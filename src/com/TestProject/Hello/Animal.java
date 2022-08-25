package com.TestProject.Hello;

public abstract class Animal{

    //Variables
    public String picture;
    public String name;
    protected int age;
    public String wagTail;
    public double treats;

    //Constructor
    public Animal(String picture, String name, int age, String wagTail, double treats){
        this.picture = picture;
        this.name = name;
        this.age = age;
        this.wagTail = wagTail;
        this.treats = treats;

    }


    public void birthday(){
        this.age++;
    }

    //getter Method
    public int getAge(){
        return this.age;
    }
    //Setter Method
    public void setAge(int age){
        this.age = age;
    }

    //All animals can speak.

    public void AnimalTalk(){
        System.out.println(this.name + " just made a sound");
    }

    //Each Sub class must implement otherwise they cannot inherit from animal
    public abstract void makeSound();


}
