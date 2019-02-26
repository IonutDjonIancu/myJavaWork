package Week1OfMooc;

import java.util.Scanner;

public class ConditionalStatementsAndBooleans
{
    public static void main(String[] args)
    {
        int num1 = 10;
        int num2 = 8;

        if (num1 > 9)
        {
            System.out.println("The number is greater than 9.");
        }

        boolean isGreater = num1 > num2;
        System.out.println(isGreater);

        if (isGreater)
        {
            System.out.println(String.format("%d is greater than %d.", num1, num2));
        }

        if (num2 > num1)
        {
            System.out.println(isGreater);
        }
        else
        {
            System.out.println(!isGreater);
        }

        System.out.println("Exercise:");
        Scanner input = new Scanner(System.in);

        System.out.print("Give a number: ");
        num1 = Integer.parseInt(input.nextLine());
        if (num1 >= 0)
        {
            System.out.println(String.format("%d is positive", num1));
        }
        else
        {
            System.out.println(String.format("%d is negative", num1));
        }

        System.out.print("How old are you? ");
        num1 = Integer.parseInt(input.nextLine());
        if (num1 >= 18)
        {
            System.out.println("You are an adult.");
        }
        else
        {
            System.out.println("You are not an adult, yet.");
        }

        System.out.print("Give a number: ");
        num1 = Integer.parseInt(input.nextLine());
        if (num1 % 2 == 0)
        {
            System.out.println(String.format("%d is even", num1));
        }
        else
        {
            System.out.println(String.format("%d is odd", num1));
        }



    }
}
