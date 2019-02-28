package UdemyCertification;

public class Person
{
    String name; // instance variable
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // static int height; // class variable, this variable is dependent and unique to the class

    public Person(String name)
    {
        this.name = name; // this.name refers to the instance of the class attribute while name will refer to the argument passed to the constructor method
        System.out.println("Person created!");
    }


    public void sayHelloTo(Person person)
    {
        System.out.println(String.format("%s said hello to %s", getName(), person.getName()));
    }
}
