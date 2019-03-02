package workbench1;

import java.util.Scanner;

public class MoreLoops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // a program that prints the integers (whole numbers) from 1 to 100.
        int num1 = 0;
        while (num1 < 100) {
            System.out.println(++num1);
        }

        // a program that prints the integers (whole numbers) from 100 to 1.
        while (num1 > 0) {
            System.out.println(num1--);
        }

        // a program that prints all even numbers between 2 and 100.
        while (num1 < 100) {
            num1++;
            if (num1 % 2 == 0) {
                System.out.println(num1);
            }
        }

        // a program that prints all whole numbers from 1 to the number the user enters.
        System.out.print("Give a number: ");
        int num2 = Integer.parseInt(scanner.nextLine());
        num1 = 1;
        while (num1 <= num2)
        {
            System.out.println(num1);
            num1++;
        }

        // a program that asks the user for the first number and the last number and then prints all numbers between those two.
        System.out.println("Give first and last numbers: ");
        num1 = Integer.parseInt(scanner.nextLine());
        num2 = Integer.parseInt(scanner.nextLine());
        while (num1 <= num2)
        {
            System.out.println(num1);
            num1++;
        }

        // a program that calculates the sum 1+2+3+…+n where n is a number entered by the user.
        System.out.print("Enter limit: ");
        num1 = Integer.parseInt(scanner.nextLine());
        num2 = 0;
        int sum = 0;
        while (num2 <= num1) {
            sum += num2;
            num2++;
        }
        System.out.println(sum);

        // the sum between two numbers
        System.out.println("Enter lower and upper limit: ");
        num1 = Integer.parseInt(scanner.nextLine());
        num2 = Integer.parseInt(scanner.nextLine());
        sum = 0;
        while (num1 <= num2) {
            sum += num1;
            num1++;
        }
        System.out.println(sum);

        // a program that calculates the factorial of the number n
        System.out.print("Enter upper limit: ");
        num1 = Integer.parseInt(scanner.nextLine());
        num2 = 1;
        sum = 1;
        while (num2 <= num1) {
            sum *= num2;
            num2++;
        }
        System.out.println(sum);

        // a program that calculates the sum of 2^0+2^1+2^2+...+2^n, where n is a number entered by the user.
        System.out.print("Enter power of 2: ");
        num1 = Integer.parseInt(scanner.nextLine());
        sum = 0;
        for (int i = 0; i <= num1; i++) {
            sum += Math.pow(2, i);
        }
        System.out.println(sum);

        // a program that asks the user to input numbers (integers). The program prints "Type numbers” until the user types the number -1. When the user types the number -1, the program prints "Thank you and see you later!" and ends.

        System.out.println("Type numbers:");
        do {
            num1 = Integer.parseInt(scanner.nextLine());
        }
        while (num1 != -1);
        System.out.println("Thank you and see you later!");

        // number reading program by adding the following feature: the program should print the sum of the numbers entered by the user (without the number -1).

        sum = 0;
        num1 = 0;
        System.out.println("Type numbers:");
        do {
            sum += num1;
            num1 = Integer.parseInt(scanner.nextLine());
        }
        while (num1 != -1);
        System.out.println("Thank you and see you later!");
        System.out.println(String.format("The sum is %d.", sum));

        // the program should print how many numbers the user typed (without the number -1).
        sum = 0;
        int counter = 0;
        System.out.println("Type numbers:");
        while (true) {
            num1 = Integer.parseInt(scanner.nextLine());
            if (num1 == -1) {
                break;
            }
            sum += num1;
            counter++;
        }
        System.out.println("Thank you and see you later!");
        System.out.println(String.format("The sum is %d.", sum));
        System.out.println(String.format("%d numbers given.", counter));

        // the program should print the average of the numbers the user typed (without the number -1).
        sum = 0;
        counter = 0;
        System.out.println("Type numbers:");
        while (true) {
            num1 = Integer.parseInt(scanner.nextLine());
            if (num1 == -1) {
                break;
            }
            sum += num1;
            counter++;
        }
        System.out.println("Thank you and see you later!");
        System.out.println(String.format("The sum is %d.", sum));
        System.out.println(String.format("%d numbers given.", counter));
        System.out.println(String.format("Average is %.2f", ((double)sum / counter)));

        // the program should print the number of even and odd numbers that the user typed (without the number -1)

        sum = 0;
        counter = 0;
        int even = 0, odd = 0;
        System.out.println("Type numbers:");
        while (true) {
            num1 = Integer.parseInt(scanner.nextLine());
            if (num1 == -1) {
                break;
            }
            else if (num1 % 2 == 0) {
                even++;
            }
            else if (num1 % 2 != 0) {
                odd++;
            }

            sum += num1;
            counter++;
        }
        System.out.println("Thank you and see you later!");
        System.out.println(String.format("The sum is %d.", sum));
        System.out.println(String.format("%d numbers given.", counter));
        System.out.println(String.format("Average is %.2f", ((double)sum / counter)));
        System.out.println(String.format("Even numbers: %d\nOdd numbers: %d", even, odd));








    }
}
