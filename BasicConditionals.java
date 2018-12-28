package com.company;

public class BasicConditionals
{
    public static void main (String[] args)
    {
        int myNum = 6;
        boolean myBool = myNum == 6;
        if (myBool)
        {
            System.out.println("Correct!");
        }
        else
        {
            System.out.println("Incorrect!");
        }

        int x = 5;
        if (x == 6)
        {
            System.out.println("x is 6");
        }
        else if (x == 5)
        {
            System.out.println("x is 5");
        }
        else
        {
            System.out.println("Not 5, not 6");
        }

        // nested if statements
        int y = -3;
        if (y < 5)
        {
            if (y > -5)
            {
                System.out.println("Triggered!");
            }
        }

        String apple = "apples";
        String orange = "oranges";
        Boolean stringBool = apple.equals(orange);
        System.out.println(stringBool);







    }
}
