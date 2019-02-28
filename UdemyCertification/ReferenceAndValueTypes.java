package UdemyCertification;

public class ReferenceAndValueTypes
{
    public static void main(String[] args)
    {
        // value types: byte, short, int, long, float, double, boolean, char
        int x = 5;
        AddOneTo(x); // this is a good example of pass by value, the value 5 is passed as a copy to the method
        System.out.println(x);

        Person john; // this creates the john object
        john = new Person("John"); // this passes the reference of john inside the memory where we are creating a new Person object and assigning john to refer to it, this is called pass by reference
        john.setAge(20);
        CelebrateBirthday(john); // we are passing that reference to a method, so the method can use that reference to manipulate the object
        System.out.println(john.getAge());

    }

    private static void CelebrateBirthday(Person person)
    {
        person.setAge(person.getAge() + 1);
    }

    static void AddOneTo(int number)
    {
        number = number + 1;
    }
}
