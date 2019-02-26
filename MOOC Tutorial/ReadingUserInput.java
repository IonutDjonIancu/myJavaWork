package Week1OfMooc;

import java.util.Scanner;

public class ReadingUserInput
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        System.out.println("What is your name? ");
        String input = reader.nextLine(); // reads a line from the input of the user and assigns it to the variable input of type string
        System.out.println(String.format("Hi %s.", input.toUpperCase()));

        System.out.println("Enter an integer: ");
        int number = Integer.parseInt(reader.nextLine());
        System.out.println(String.format("You typed: %d", number));

        System.out.println("=================");
        String name;
        int age;
        System.out.println("What is your name?");
        name = reader.nextLine();
        System.out.println("What is your age?");
        age = Integer.parseInt(reader.nextLine());
        System.out.println(String.format("Your name is %s, and you are %d years old.", name, age));

        System.out.println("Exercise:");
        int num1, num2;

        System.out.print("Type a number: ");
        num1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        num2 = Integer.parseInt(reader.nextLine());
        System.out.println(String.format("Sum of numbers is %d", num1 + num2));

        System.out.print("Type a number: ");
        num1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        num2 = Integer.parseInt(reader.nextLine());
        System.out.println(String.format("Division of numbers is %.2f", num1 / (double)num2));

        System.out.print("Give radius: ");
        num1 = Integer.parseInt(reader.nextLine());
        System.out.println(String.format("Circumference of the circle: %.5f", 2 * num1 * Math.PI));

        System.out.print("Type a number: ");
        num1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        num2 = Integer.parseInt(reader.nextLine());
        System.out.println(String.format("The bigger of the two numbers is %d", Math.max(num1, num2)));

        String str1, str2;
        System.out.print("Type a name: ");
        str1 = reader.nextLine();
        System.out.print(String.format("Type the age of %s: ", str1));
        num1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type another name: ");
        str2 = reader.nextLine();
        System.out.print(String.format("Type the age of %s: ", str2));
        num2 = Integer.parseInt(reader.nextLine());
        System.out.println(String.format("%s and %s are %d years old in total.", str1, str2, num1 + num2));






    }
}
