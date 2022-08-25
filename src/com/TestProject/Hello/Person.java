package com.TestProject.Hello;

public class Person {

    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private int ssn;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName, String middleName, String lastName,int age, int ssn){

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String getFirstName(){return firstName;}

    public String getMiddleName(){return middleName;}

    public String getLastName(){return lastName;}

    public String getFullName(){return firstName + " " + lastName;}

    public int getAge(){return age;}

    public boolean isOlderThan(int olderthan){return age >= olderthan;}

}
