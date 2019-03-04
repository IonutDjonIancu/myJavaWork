import java.util.*;

public class ObjectsAndArrayList {
    public static void main(String[] args) {
        ObjectsAndArrayList obj = new ObjectsAndArrayList();

        // Strings are objects and accept two was of declaration and initialization
        String str1 = new String("Bananaman"); // this method is uncommon and not used in programming
        String str2 = "Strawberywoman";

        // objects accept structure calls via (.) dot and will open a list of methods
        System.out.println(str1.length());

        //ArrayList is a container object
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jim");
        names.add("Sarah");
        names.add("Arcturus");
        names.add("Duke");
        names.add("Duran");

        System.out.println(String.join("_", names));
        System.out.println(names.contains("J"));
        System.out.println(names.contains("Ji"));
        System.out.println(names.contains("Jim"));
        System.out.println(names.indexOf("Jim"));
        System.out.println(names.get(0));

        System.out.println("-------------");
        for (String i : names) {
            System.out.println(i);
        }
        names.remove(names.get(2));
        System.out.println("-------------");
        for (String i : names) {
            System.out.println(i);
        }
        names.remove(2);
        System.out.println("-------------");
        for (String i : names) {
            System.out.println(i);
        }
        System.out.println("-------------");

        obj.inputNames();
        obj.compareNames();
        obj.printAlphaReversed();

        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Hello1");
        myList.add("Hello2");
        myList.add("Hello3");
        myList.add("Hello4");
        System.out.println("There are " + obj.countMyList(myList) + " items in the list.");

        obj.removeAtIndex(myList, 0);

        ArrayList<Integer> myIntList = new ArrayList<Integer>();
        myIntList.add(8);
        myIntList.add(6);
        myIntList.add(2);
        myIntList.add(11);
        myIntList.add(24);

        System.out.println(obj.sumArrayList(myIntList));
        System.out.println(obj.averageArrayList(myIntList));

        myIntList = obj.lengthOfStrings(myList);
        System.out.println(myIntList);

        System.out.println(obj.returnGreatest(myIntList));
        System.out.println(obj.sampleVariance(myIntList));
        System.out.println(obj.uniqueNumber(myIntList, 8));
        System.out.println(obj.palindrome(myList.get(0)));

    }

    boolean palindrome(String input) {
        String x = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            x += input.charAt(i);
        }

        if (input.equals(x)) {
            return true;
        }
        return false;
    }

    boolean uniqueNumber(ArrayList<Integer> input, int number) {
        for (int i : input) {
            if (number == i) {
                return true;
            }
        }
        return false;
    }

    double sampleVariance(ArrayList<Integer> input) {
        ArrayList<Integer> storedInts = new ArrayList<Integer>();
        int average, sum = 0;
        for (int i : input) {
            sum += i;
        }
        average = sum / input.size();

        for (int i : input) {
            storedInts.add(i - average);
        }

        double initVariance = 0;
        for (int i : storedInts) {
            initVariance += Math.pow(i, 2);
        }

        return initVariance / (storedInts.size() - 1);
    }



    int returnGreatest(ArrayList<Integer> input) {
        int great = input.get(0);

        for (int i : input) {
            if (i > great) {
                great = i;
            }
        }

        return great;
    }

    ArrayList<Integer> lengthOfStrings(ArrayList<String> input) {
        ArrayList<Integer> lengths = new ArrayList<Integer>();
        for (String i : input) {
            lengths.add(i.length());
        }
        return lengths;
    }

    double averageArrayList(ArrayList<Integer> input) {
        int sum = 0;
        for (int i : input) {
            sum += i;
        }
        return (double) sum / input.size();
    }

    int sumArrayList(ArrayList<Integer> input) {
        int sum = 0;
        for (int i : input) {
            sum += i;
        }
        return sum;
    }

    void removeAtIndex (ArrayList<String> input, int index) {
        input.remove(index);
        System.out.println("New list is:");
        for (String i : input) {
            System.out.println(i);
        }

    }

    int countMyList(ArrayList<String> input) {
        return input.size();
    }

    void printAlphaReversed() {
        ArrayList<String> names = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.print("Type a new word: ");
            input = scanner.nextLine();
            names.add(input);
            if (input.equals("")) {
                break;
            }
        }

        System.out.print("Sort list by [alpha][reversed]: ");
        input = scanner.nextLine().toLowerCase();
        if (input.equals("alpha")) {
            Collections.sort(names);
            System.out.println("Your list is:");
            names.remove(0);
            for (String i : names) {
                System.out.println(i);
            }
        }
        else if (input.equals("reversed")) {
            Collections.reverse(names);
            System.out.println("Your list is:");
            names.remove(0);
            for (String i : names) {
                System.out.println(i);
            }
        }
        else {
            System.out.println("Your list is:");
            for (String i : names) {
                System.out.println(i);
            }
        }
    }


    void compareNames() {
        ArrayList<String> names = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.print("Enter new word: ");
            input = scanner.nextLine();
            if (names.contains(input)) {
                break;
            }
            names.add(input);

        }
        System.out.println("Duplicate found for word " + input);
    }


    void inputNames() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        String input;
        while (true) {
            System.out.print("Enter a name: ");
            input = scanner.nextLine();
            names.add(input);

            if (input.equals("")) {
                break;
            }
        }

        System.out.println("You typed the following names:");
        for (String i : names) {
            System.out.println(i);
        }
    }

    public ObjectsAndArrayList() {
    }
}
