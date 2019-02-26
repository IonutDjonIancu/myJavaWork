package com.company;

public class Classes
{
    public static void main (String[] args)
    {
        Dog baxter = new Dog("Baxter", 4);
        Dog fluffy = new Dog("Fluffy", 2);
        blanks();
        fluffy.eat();
        blanks();
        baxter.bark();
        blanks();

        Cat myCat = new Cat("homeCat");
        System.out.println(myCat.breed);
        blanks();

    }

    public static void blanks ()
    {
        System.out.println("===================");
    }


}

class Animal
{
    int age = 0;
    void eat()
    {
        System.out.println("Munch!");
    }
}

class Dog extends Animal
{
    String name;

    void bark ()
    {
        System.out.println("Woof!!!");
    }

    void eat()
    {
        super.eat();
        System.out.println("Eat a doggy snack.");
    }

    // this is the constructor
    Dog (String dogName, int age)
    {
        super();
        name = dogName;
        this.age = age;
        bark();
        //eat();
    }
}

class Cat
{
    String breed;
    Cat (String breed)
    {
        this.breed = breed;
    }


}
