package Week1OfMooc;

import java.util.Scanner;

public class Loops
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String str1, str2;
        int num1, num2;

        while (true)
        {
            System.out.println("I can program!");
            System.out.print("Continue? ('no' to quit) ");

            str1 = input.nextLine();
            if (str1.equals("no"))
            {
                break;
            }
        }
        System.out.println("Thank you and see you later.");

        System.out.println("***Calculator***");

        while (true)
        {
            System.out.print("Enter a command (sum, diff, quit): ");
            str1 = input.nextLine();

            if (str1.toUpperCase().equals("QUIT"))
            {
                break;
            }

            if (str1.toUpperCase().equals("SUM"))
            {
                System.out.println("Enter two numbers:");
                num1 = Integer.parseInt(input.nextLine());
                num2 = Integer.parseInt(input.nextLine());
                System.out.println(String.format("%d + %d = %d", num1, num2, num1 + num2));
            }
            else if (str1.toUpperCase().equals("DIFF"))
            {
                System.out.println("Enter two numbers:");
                num1 = Integer.parseInt(input.nextLine());
                num2 = Integer.parseInt(input.nextLine());
                System.out.println(String.format("%d - %d = %d", num1, num2, num1 - num2));
            }
            else
            {
                System.out.println("Unknown command!");
            }
        }

        System.out.println("Thank you for using the calculator, bye!");

        System.out.println("Exercise:");

        System.out.println("Type the password: ");
        str1 = input.nextLine();

        while (!str1.equals("carrot"))
        {
            System.out.println("Wrong!");
            System.out.println("Type the password: ");
            str1 = input.nextLine().toUpperCase();
        }

        System.out.println("Right!\nThe secret is: jryy qbar!");

        System.out.println("Insert temperature [0-45]: ");
        num2 = Integer.parseInt(input.nextLine());

        System.out.println("Temperatures graph:\n|");
        for (num1 = 0; num1 < 45; num1++)
        {
            if (num1 == num2)
            {
                System.out.print("*");
            }
            System.out.print("_");
        }
        System.out.println("\n");
        for (num1 = 0; num1 <= 45; num1++)
        {
            System.out.print(String.format("%d", num1 % 10));
        }
        System.out.println("\n");
        for (num1 = 0; num1 <= 45; num1++)
        {
            if (num1 % 10 == 0)
            {
                System.out.print(num1 / 10);
            }
            else
            {
                System.out.print("_");
            }
        }
        System.out.println("\n");



    }
}
