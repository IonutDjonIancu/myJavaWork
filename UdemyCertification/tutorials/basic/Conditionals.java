package UdemyCertification.tutorials.basic;

import java.util.Random;

public class Conditionals
{
    public static void main(String[] args)
    {
        boolean sayHello = false;

        if (sayHello)
        {
            System.out.println("Hello");
        }
        else
        {
            System.out.println("Goodbye");
        }

        Random random = new Random();
        int x = random.nextInt(10) + 1;
        System.out.println(x);

        if (x == 5)
        {
            System.out.println(true);
        }

        if (x < 4 || x > 8)
        {
            System.out.println(x);
        }
        else if (x >= 4 && x <= 8)
        {
            System.out.println("middle");
        }
        else
        {
            System.out.println("it's broken");
        }



    }
}
