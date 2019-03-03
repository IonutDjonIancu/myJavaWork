package workbench1;

import java.util.Random;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        Methods methods = new Methods();
        Scanner scanner = new Scanner(System.in);
        int num1, num2, sum, counter;
        String str1, str2;

        // Create a method printText that prints the following string of characters: "In the beginning there were the swamp, the hoe and Java." and a line break
        methods.printText();

        // Develop the program by adding the following feature: the main program should ask the user how many times the text should be printed (meaning how many times the method is called)

        System.out.println("How many types should printText appear: ");
        num1 = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num1; i++) {
            methods.printText();
        }

        // Create a method printStars that prints the given amount of stars and a line break.
        methods.printStars(5);
        System.out.println();

        // Create a method printSquare(int sideSize) that prints a square
        methods.printSquare(4);
        System.out.println();

        // Create a method printRectangle(int width, int height) that prints a rectangle
        methods.printRectangle(3, 7);
        System.out.println();

        // Create the method printTriangle(int size) that prints a triangle
        methods.printTriangle(4);
        System.out.println();

        // Create a method printWhitespaces(int size) that prints the given amount of whitespaces.
        methods.printWhitespace(4);
        System.out.println();

        // Create the method printTriangle(int size) that prints a triangle using the mehtods printWhitespaces and printStars
        methods.printReversedTriangle(4);
        System.out.println();

        // Create the method xmasTree(int height) that prints a Christmas tree using the methods printWhitespaces and printStars.
        methods.printChristmasTree(10);
        System.out.println();

        // Create a program that draws a number. Then the user has the chance to guess once, what the number is.
        methods.guessNumber();






    }

    void guessNumber () {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numRand, numGuess, guesses = 0;
        numRand = random.nextInt(11);

        do {
            System.out.print("Guess number: ");
            numGuess = Integer.parseInt(scanner.nextLine());
            if (numGuess == numRand) {
                System.out.println("Correct!");
                break;
            }
            else if (numGuess == -1) {
                System.out.println("Number was " + numRand);
                break;
            }
            else {
                guesses++;
                if (numGuess < numRand) {
                    System.out.println("Number is greater, guesses made: " + guesses);
                }
                else {
                    System.out.println("Number is smaller, guesses made: " + guesses);
                }
            }
        }
        while (numGuess != numRand);
    }

    void printChristmasTree(int size) {
        Methods methods = new Methods();
        int decrease = size;
        int i = 1;
        for (i = 1; i <= size; i++) {
            methods.printWhitespace(decrease);
            decrease--;
            methods.printStars(i);
            if (i > 1) {
                methods.printStars((i - 1));
            }
            System.out.println();
        }

        for (i = 0; i < 2; i++) {
            methods.printWhitespace(size - 1);
            methods.printStars(3);
            System.out.println();
        }
    }

    void printReversedTriangle(int size) {
        Methods methods = new Methods();
        int decrease = size;
        for (int i = 1; i <= size; i++) {
            methods.printWhitespace(decrease);
            decrease--;
            methods.printStars(i);
            System.out.println();
        }

    }

    void printWhitespace (int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print(' ');
        }
    }

    void printStars (int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print('*');
        }
    }

    void printTriangle (int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 1; j <= (i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void printRectangle (int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void printSquare (int amount) {
        for (int i = 0; i < amount; i++) {
            for (int j = 0; j < amount; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

}
