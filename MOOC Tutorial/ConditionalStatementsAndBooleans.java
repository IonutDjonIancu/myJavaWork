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

        if (num1 > 0)
        {
            System.out.println("Num1 > 0");
        }
        else if (num1 == 0)
        {
            System.out.println("Num1 = 0");
        }
        else
        {
            System.out.println("Num1 < 0");
        }

        String str1 = "course";
        String str2 = "horse";

        if (str1.equals("course"))
        {
            System.out.println("This is a nice course");
        }
        else
        {
            System.out.println(!isGreater);
        }

        if (str1.equals(str2))
        {
            System.out.println("They're the same.");
        }
        else
        {
            System.out.println("String are different!");
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

        System.out.println("Type the first number: ");
        num1 = Integer.parseInt(input.nextLine());

        System.out.println("Type the second number: ");
        num2 = Integer.parseInt(input.nextLine());

        if (num1 > num2)
        {
            System.out.println(String.format("The greater number is: %d", num1));
        }
        else if (num1 == num2)
        {
            System.out.println("The numbers are equal!");
        }
        else
        {
            System.out.println(String.format("The greater number is: %d", num2));
        }

        System.out.print("Type the points [0-60]: ");
        num1 = Integer.parseInt(input.nextLine());

        if (num1 < 30)
        {
            System.out.println("failed");
        }
        else if (num1 >= 30 && num1 < 35)
        {
            System.out.println("Grade: 1");
        }
        else if (num1 >= 35 && num1 < 39)
        {
            System.out.println("Grade: 2");
        }
        else if (num1 >= 40 && num1 < 44)
        {
            System.out.println("Grade: 3");
        }
        else if (num1 >= 45 && num1 < 49)
        {
            System.out.println("Grade: 4");
        }
        else if (num1 >= 50 && num1 < 60)
        {
            System.out.println("Grade: 5");
        }

        System.out.print("How old are you? ");
        num1 = Integer.parseInt(input.nextLine());

        if (num1 > 0 && num1 <= 120)
        {
            System.out.println("OK");
        }
        else
        {
            System.out.println("Impossible!");
        }

        System.out.println("Type your username: ");
        str1 = input.nextLine();
        System.out.println("Type your password: ");
        str2 = input.nextLine();

        if (str1.equals("alex") && str2.equals("mightyducks"))
        {
            System.out.println("You are now logged into the system!");
        }
        else if (str1.equals("emily") && str2.equals("cat"))
        {
            System.out.println("You are now logged into the system!");
        }
        else
        {
            System.out.println("Your username or password was invalid!");
        }

        if (num1 % 4 == 0)
        {
            if (num1 % 100 == 0)
            {
                if (num1 % 400 == 0)
                {
                    System.out.println("Year is leap year.");
                }
                else
                {
                    System.out.println("Year is not leap year.");
                }
            }
            else
            {
                System.out.println("Year is leap year.");
            }
        }
        else
        {
            System.out.println("Year is not leap year.");
        }

    }
}
