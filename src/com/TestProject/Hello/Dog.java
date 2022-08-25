package com.TestProject.Hello;

public class Dog extends Animal implements IPetAble, IFly{


    //public, private, protected, (static, final)
    //Static = is called on the class and not the object , Called on class not object-> Dog.dogToHumanMultiplier
    public static final int dogToHumanYearMultiplier = 7; //Do not need objects to access this

    //Final = cannot change, Constant variable.
    public static final int yearsToDog = 7;

    //Default constructor
    //public Dog() {

    //}


    //Created class constructor.
    public Dog(String picture, String name, int age, String wagTail, double treats){
        super(picture, name, age, wagTail, treats);
    }

    public void woof(){
        System.out.println(this.name + " just woofed!");
    }


    // public static final int yearsToDog = 7;
    //public static final int dogToHumanYearMultiplier = 7;
    public int getYearsToDog(){
        return this.age * Dog.dogToHumanYearMultiplier; //Getting age and Multiplying by dogToHuman final variable type
    }
    public static void outputDog(Dog dog){
        System.out.println(dog.name);
        System.out.println(dog.getAge());
    }

    //Overrides the AnimalTalk() method in Animal class. This(dog) class just extends animal.
    @Override
    public void AnimalTalk() {
        System.out.println(this.name + " just woofed.");
    }

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
