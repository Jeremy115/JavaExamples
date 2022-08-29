package com.TestProject.Hello;

//Created in JAVA 17.

import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Supplier;


import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {

        //Uncomment methods to see what how they work.


        //List
        //listOfStuff();

        //Classes and Objects.
        //dogJavaClass();

        //Inheritance and Polymorphism:
        //dogAndCatInheritanceOfAnimal();

        //Interface and Abstract classes.
        //abstractClassAndInterface();

        //Exercise:
        //bankAccountProblem();

        //AnonymousClasses.
        //anonoymousClass();


        //ENUMS
        //enumsJava();

        //Exceptions.
        //exceptionsJava();

        //Lambda expression, supplier class.
        //lambdaExpression();

        //Generics
        //genericsjava();


        //GUI interfaces.
        //guiInterfaces gui = new guiInterfaces();//New instance of Test class.
        //gui.TableToJpanel(); //Using Test method to run code.



        // collatz conjecture.
        //collatzConjecturTheory();

    }






    //Need throws exception as it tells compiler it might throw an exception.
    public static void checkForException(int number) throws Exception{
        if (number == 0){
            throw new Exception("NUMBER IS ZERO!");
        }
    }
    //List and Sets and hashMaps
    public static void printOutSetNames(Set<String> name){
        for(String str: name){
            System.out.println(str);
        }
    }
    public static void addNamesToSetList(Set<String> names){
        names.add("jeremy");
        names.add("Wilson");
        names.add("Clark");
        names.add("Roll Tide");
        names.add("Hello World");
    }
    public static void addHashMapList(Map<String, Integer> maps){
        maps.put("clean",1);
        maps.put("works",2);
        maps.put("feed",3);
        maps.put("love",4);

        System.out.println(maps.get("clean"));

        System.out.println("Contains Key 'clean' " + maps.containsKey("clean"));
        System.out.println("Contains Value 'clean' " + maps.containsValue("clean"));
    }
    public static void addNumbersToList(List<Integer> numbers){
        numbers.add(23);
    }
    public static void addQuestionsToList(List<String> questionList){
        questionList.add("Hi, nice to meet you.");
        questionList.add("Once you die, you die");
        questionList.add("Where are you hiding?.");
        questionList.add("How old are you?");
    }
    public static void printListPairs(List<String>questionList){
        System.out.println(questionList.size());
        System.out.println(questionList.get(2));
    }
    public static void listOfStuff(){
        //String type List
        List<String> questionList = new ArrayList<String>();
        addQuestionsToList(questionList);
        printListPairs(questionList);

        //Number type list
        List<Integer> numbers = new ArrayList<Integer>();
        addNumbersToList(numbers);

        //Maps
        //Map key to certain value. Key-value pairs
        Map<String, Integer> maps = new HashMap<>();
        addHashMapList(maps);

        //Sets have no duplicates.
        Set<String> names = new HashSet<>();
        addNamesToSetList(names);
        printOutSetNames(names);
    }

    //Classes and Access Modifiers(Static, protected, final, private)
    public static void dogJavaClass(){
        //Class and Objects

        //Default Constructor
        //Dog dog = new Dog();
        //System.out.println(dog.name); :  PRINTS: NULL as nothing in default constructor

        //Replaced Constructor
        Dog luna = new Dog("luna.png", "luna", 5, "up and down", 3.45f );

        //passing in information about dog.
        Dog.outputDog(luna);


        //Replaced Constructor
        Dog china = new Dog("china.png", "china", 10, "side to side", 2.78f );
        Dog.outputDog(china);


        //Object call for woof
        luna.woof();
        china.woof();

        //Called
        System.out.println(luna.name + " is " + luna.getYearsToDog() + " in Human years.");
    }
    public static void dogAndCatInheritanceOfAnimal(){
        Dog fire = new Dog("fire.png", "fire", 9, "forwards", 4.05f);
        Dog ice = new Dog("ice.png", "ice", 9, "backwards", 4.05f);

        Cat ground = new Cat("ground.png", "ground", 5, "up and down", 3.58f);

        //Cat and dog class both @Override the AnimalTalk() to meow and woof.
        ground.AnimalTalk();
        fire.AnimalTalk();


        List<Animal> animal = new ArrayList<>();

        animal.add(fire);
        animal.add(ice);
        animal.add(ground);

        //Getting arrayList of animal(ice) in this case. Then getting it to speak(woof).
        //Since ice is made with dog class that means attributes are of a dog.
        animal.get(1).AnimalTalk();


        //Polymorphism, ability of an object to take on different forms.
        Animal animals = new Dog("jenny.png", "jenny", 9, "No tail", 1.00f);
        animals.AnimalTalk();
    }
    public static void abstractClassAndInterface(){
        Dog fire = new Dog("fire.png", "fire", 9, "forwards", 4.05f);
        Dog ice = new Dog("ice.png", "ice", 9, "backwards", 4.05f);

        Cat ground = new Cat("ground.png", "ground", 5, "up and down", 3.58f);

        //Cat and dog class both @Override the AnimalTalk() to meow and woof.
        ground.AnimalTalk();
        fire.AnimalTalk();


        List<Animal> animal = new ArrayList<>();

        animal.add(fire);
        animal.add(ice);
        animal.add(ground);

        //Getting arrayList of animal(ice) in this case. Then getting it to speak(woof).
        //Since ice is made with dog class that means attributes are of a dog.
        animal.get(1).AnimalTalk();


        //Polymorphism, ability of an object to take on different forms.
        Animal animals = new Dog("jenny.png", "jenny", 9, "No tail", 1.00f);
        animals.AnimalTalk();

        //Abstract class
        //cannot say:
        //   Animal animal1 = new Animal();
        // Cannot be used to create objects, only inherited by other classes.


        //Creating Interface List.
        List<IPetAble> pet = new ArrayList<>();
        pet.add(fire);
        pet.add(ice);
        pet.add(ground);
        pet.add(new Bird("chicken.png", "chicken", 13, "does not wag tail", 2.45f));

        //Printing Interface List.
        for(IPetAble pets: pet){
            pets.pet();
        }
    }

    public static void bankAccountProblem(){
        Person person1 = new Person("bob", "stan", "jones", 25, 3452);
        Person person2 = new Person("john", "can", "dow", 43,4857);
        Person person3 = new Person("karie", "suzui", "jacobs", 16,4807);

        //Bank List of people.
        List<Person> peopleList = new ArrayList<>();
        peopleList.add(person1);
        peopleList.add(person2);

        Bank bank = new Bank("First World Bank");

        bank.openBankAccount(person1, 2000);
        bank.openBankAccount(person2, 20);

        System.out.println(bank.getAccountByPerson(person1).getBalance());
        bank.withdrawAmount(3000, person1);
    }
    public static void anonoymousClass(){

        //Regular object instance
        Person per = new Person("Jeremy", "Wilson", 22);

        //Anonymous object class.
        Person manager = new Person("John", "Smith", 34){

            @Override
            public String getFullName(){
                return "Manager " + super.getFullName();
            }
        };

        System.out.println(per.getFullName());
        System.out.println(manager.getFullName());
    }
    public static void enumsJava(){
        //Predefined set of variables.

        Difficulty gameDifficulty = Difficulty.MEDIUM;
        gameDifficulty = Difficulty.HARD;

        ToolTeir tier = ToolTeir.DIAMOND;
        System.out.println(tier.getAttackMultiplier());
    }
    public static void exceptionsJava() throws Exception {

        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int z = in.nextInt();


        checkForException(i);


        try{

            checkForException(z);

        }catch (Exception e) {
            System.out.println("ERROR THROWN: " + e.getMessage());
        }finally {
            //Happens if exception caught or not.
            System.out.println("Finally");
        }

        System.out.println("This always happens");
    }
    public static void lambdaExpression(){
        //Regular dateTime method.
        LocalDateTime dateTime = LocalDateTime.now();

        //Parameter -> expression
        //Empty parameter, represents a method with no parameters within.
        Supplier<LocalDateTime> dateSupplier = () -> LocalDateTime.now();

        //Print the different variances of LocalDateTime.
        System.out.println(dateTime);
        System.out.println(dateSupplier.get());


        //Wait 3 seconds.
        System.out.println("Waiting for 3 seconds");
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        //Print the same variances of LocalDateTime.
        System.out.println(dateTime);
        System.out.println(dateSupplier.get());
    }
    public static void genericsjava(){
        //List
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Here is list(int): " + numbers);

        //Pair Class, Takes in parameters of any type. I have set them for Integer and float types.
        Pair<Integer, Float> pair = new Pair<>(20, 24f);
        System.out.println(pair);


        //Wild card for Pair class.
        // I have passed an Integer and a variable which can have anything(string, int, double, etc...)
        Pair<Integer, ?> pair2 = new Pair<>(4, 2f);
        System.out.println(pair2);

    }
    public static void collatzConjecturTheory(){

        long x = 5;
        long y = x;
        int z = 0;

        System.out.println("Starting number y = " + y);

        while (y != 1 && y > 0) {


            if (y % 2 == 0) {

                y /= 2;
                z++;
                //System.out.println("y = " + y);

            } else {

                y = 3 * y + 1;
                z++;
                //System.out.println("y = " + y);
            }

            if(y == 1){ //if y is equal to 1

                System.out.println("Starting value = " + x );
                System.out.println("Number of lines = " + z );
                z = 0;

                x += 1;    //we add 1 back to the original number.

                y = x;     //Set the new number to y which was originally 5, but we add one to the original number
            }

            if(x == 205){ break;}  //Number to break the loop. So it does not go forever.

        }

    }

}
