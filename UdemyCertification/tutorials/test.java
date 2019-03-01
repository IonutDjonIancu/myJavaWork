package UdemyCertification.tutorials;

import UdemyCertification.tutorials.basic.Constants;
import UdemyCertification.tutorials.basic.Person;

public class test
{
    public static void main(String[] args)
    {
        Person john = new Person("John");
        System.out.println(john.getName());

        System.out.println(Constants.WIDTH);
    }
}
