import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {



        Strings strings = new Strings();
        String str1 = "Bilbo";
        System.out.println(str1.charAt(2));

        System.out.println(str1.charAt(str1.length() - 1));

        for (int i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i));
        }

        System.out.println();
        System.out.println(strings.lengthName("Marius"));
        System.out.println(strings.firstChar("Ona"));
        System.out.println(strings.lastChar("Smaug"));
        strings.firstThree("FFFFF");
        strings.returnAllChars("Iron Maiden");
        System.out.println();
        strings.reversedName("Mandalore");
        System.out.println();

        System.out.println(str1.substring(1));
        System.out.println(str1.substring(1, 3));

        strings.returnFirstPart("Dragon");
        strings.returnLastPart("Baloon");

        strings.twoWords();
        strings.reverseText("Doombreaker");




    }

    void twoWords() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give two words:");
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        int x = input1.indexOf(input2);
        if (x > 0) {
            System.out.println("Found at index " + x);
        }
        else {
            System.out.println("Nothing matched");
        }
    }

    void reverseText(String input) {
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
    }

    void returnLastPart(String input) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length of last part: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println(input.substring((input.length() - a)));
    }

    void returnFirstPart(String input) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length of first part: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println(input.substring(a));
    }

    void reversedName(String input) {
        for (int j = input.length() - 1; j >= 0; j--) {
            System.out.print(input.charAt(j) + "*");
        }
    }

    void returnAllChars(String input) {
        for (int i = 0; i < input.length(); i++) {
            System.out.print(input.charAt(i) + " ");
        }
    }

    void firstThree(String input) {
        if (input.length() < 3) {
            //return null;
        }
        else {
            System.out.println(String.format("%c\n%c\n%c", input.charAt(0), input.charAt(1), input.charAt(2)));
        }
    }

    char lastChar(String input) {
        return input.charAt(input.length() - 1);
    }

    char firstChar(String input) {
        return input.charAt(0);
    }

    int lengthName(String input) {
        return input.length();
    }


    public Strings() {
    }
}
