package UdemyCertification.tutorials.basic;

public class ClassesAndObjects
{
    public static void main(String[] args)
    {
        Person john = new Person("John");
        john.setAge(20); // used a get/set method
        Person mark = new Person("Mark");
        mark.setAge(25);

        System.out.println(john.getName() + " is " + john.getAge() + " years old");
        System.out.println(String.format("%s is %d years old", john.getName(), john.getAge()));

        john.sayHelloTo(mark);
        mark.sayHelloTo(john);


        john.setName("Johnny");
        System.out.println(john.getName());


    }
}
