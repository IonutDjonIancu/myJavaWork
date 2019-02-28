package Week2OfMooc;

import java.util.Scanner;

public class ChangingVariables
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        String str1, str2;

        num1 = 10;
        System.out.println(num1);
        num1++;
        System.out.println(num1);
        num1--;
        System.out.println(num1);

        






        System.out.println("Exercise:");

        System.out.println("Type the three numbers:");
        num1 = 0;
        num2 = Integer.parseInt(input.nextLine());
        num1 += num2;
        num2 = Integer.parseInt(input.nextLine());
        num1 += num2;
        num2 = Integer.parseInt(input.nextLine());
        num1 += num2;
        System.out.println(String.format("Sum: %d", num1));

        num2 = 0;
        while (true)
        {
            num1 = Integer.parseInt(input.nextLine());
            if (num1 == 0)
            {
                break;
            }

            num2 += num1;
            System.out.println("Sum now: " + num2);
        }
        System.out.println("Final sum: " + num2);


















    }
}
