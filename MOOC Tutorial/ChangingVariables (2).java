package workbench1;

import java.util.Scanner;

public class ChangingVariables {
    public static void main(String[] args) {
        // program that asks the user for three numbers and then prints their sum
        Scanner scanner = new Scanner(System.in);
        int num1, sum = 0;

        System.out.println("Give three numbers:");
        num1 = Integer.parseInt(scanner.nextLine());
        sum += num1;
        num1 = Integer.parseInt(scanner.nextLine());
        sum += num1;
        num1 = Integer.parseInt(scanner.nextLine());
        sum += num1;

        System.out.println(sum);

        // program that reads numbers from the user and prints their sum. The program should stop asking for numbers when user enters the number 0

        sum = 0;
        System.out.println("Give a number [!=0]:");
        do {
            num1 = Integer.parseInt(scanner.nextLine());
            sum += num1;
        }
        while (num1 != 0);
        System.out.println(sum);





    }


}
