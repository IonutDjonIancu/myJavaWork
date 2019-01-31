package org.gameloft.ConditionalStatements;

public class IfElse
{
    public static void main(String[] args)
    {
        System.out.println("Begin");

        int votingAge = 18;
        int age = 18;

        if (age < votingAge)
        {
            System.out.println("Cannot vote");
        }
        else if (age >= votingAge)
        {
            System.out.println("Maybe you can vote");
        }

        int drivingAgeLower = 18;
        int drivingAgeUpper = 85;
        age = 16;

        if (age < drivingAgeLower)
        {
            System.out.println("too young to drive");
        }
        else if (age > drivingAgeUpper)
        {
            System.out.println("too old to drive");
        }
        else
        {
            System.out.println("can drive");
        }

        if (age < drivingAgeLower || age > drivingAgeUpper)
        {
            System.out.println("unfit to drive");
        }
        else
        {
            System.out.println("can drive");
        }

        // ternary operator
        int a = 2;
        int b = 3;
        System.out.println( (a > b) ? true : false);








        System.out.println("End of code");
    }
}








