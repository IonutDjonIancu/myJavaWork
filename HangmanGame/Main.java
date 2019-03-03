package HangmanGame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String menuOption;
        Scanner scanner = new Scanner(System.in);
        Hangman hangman = new Hangman();

        hangman.header();
        while (true) {
            hangman.printMenu();
            System.out.print("Take a guess: ");
            menuOption = scanner.nextLine().toLowerCase();
            if (menuOption.equals("quit")) {
                System.out.println("Thanks for playing.");
                break;
            }
            else if (menuOption.equals("status")) {
                hangman.printStatus();
            }
            else if (menuOption.equals("man")) {
                hangman.printMan();
            }
            else if (menuOption.isEmpty()) {
            }
            else if(menuOption.length() == 1) {
                hangman.addUsedLetters(menuOption);
                hangman.guess(menuOption);
            }
            else {
                System.out.println("Wrong value given");
            }

            if (hangman.check()) {
                System.out.println("You got it, you won the hangman contest!");
                break;
            }
        }

        hangman.printWord();
    }
}
