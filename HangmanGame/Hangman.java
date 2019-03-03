package HangmanGame;

import java.util.ArrayList;

public class Hangman {

    public static final String SECRETWORD = "rocket";
    private String[] guessedLetters = new String[6];
    private ArrayList<String> usedLetters = new ArrayList<String>();

    void header() {
        System.out.println("************");
        System.out.println("* Hangman *");
        System.out.println("************");
        System.out.println("");
    }

    void printMenu() {
        System.out.println("* menu *");
        System.out.println("quit - quits the game");
        System.out.println("status - prints the used letters");
        System.out.println("man - prints the word and guessed letters");
        System.out.println("a single letter - uses the letter as a guess");
        System.out.println("an empty line prints this menu");
        System.out.println();
    }

    void addUsedLetters(String letter) {
        usedLetters.add(letter);
    }

    void printStatus() {
        System.out.print("Used letters so far: ");
        for (String i : usedLetters) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    void printWord() {
        System.out.println(SECRETWORD);
    }

    void printMan() {
        System.out.print("Your guess so far: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(guessedLetters[i]);
        }
        System.out.println("\n");
    }

    void guess (String letter) {
        if (letter.equals("r"))
        {
            System.out.println("Congrats, you got one right");
            guessedLetters[0] = "r";
            printMan();
        }
        else if (letter.equals("o")) {
            System.out.println("Congrats, you got one right");
            guessedLetters[1] = "o";
            printMan();
        }
        else if (letter.equals("c")) {
            System.out.println("Congrats, you got one right");
            guessedLetters[2] = "c";
            printMan();
        }
        else if (letter.equals("k")) {
            System.out.println("Congrats, you got one right");
            guessedLetters[3] = "k";
            printMan();
        }
        else if (letter.equals("e")) {
            System.out.println("Congrats, you got one right");
            guessedLetters[4] = "e";
            printMan();
        }
        else if (letter.equals("t")) {
            System.out.println("Congrats, you got one right");
            guessedLetters[5] = "t";
            printMan();
        }
        else {
            System.out.println("Nope...");
            System.out.println();
        }

    }

    boolean check() {
        if (guessedLetters[0].equals("r")) {
            if (guessedLetters[1].equals("o")) {
                if (guessedLetters[2].equals("c")) {
                    if (guessedLetters[3].equals("k")) {
                        if (guessedLetters[4].equals("e")) {
                            if (guessedLetters[5].equals("t")) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public Hangman() {
        for (int i = 0; i < 6; i++) {
            guessedLetters[i] = "?";
        }
    }
}
