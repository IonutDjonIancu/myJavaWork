import java.util.ArrayList;

public class ObjectsAndArrayList {
    public static void main(String[] args) {
        // Strings are objects and accept two was of declaration and initialization
        String str1 = new String("Bananaman"); // this method is uncommon
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

        // remained at Exercise 57: Words

    }
}
