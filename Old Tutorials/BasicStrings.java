package com.company;

public class BasicStrings
{
    public static void main (String[] args)
    {
        String myString = "hello world";
        System.out.println(myString.length());

        String emptyString = "";
        if (emptyString.isEmpty())
        {
            System.out.println("it's empty");
        }

        String a = new String();
        a = "hi";
        String b = "";
        System.out.println(a.equals(b));

        String c = "Java is ";
        String d = a.concat("rad!");

        char[] bilboArray = {'B', 'i', 'l', 'b', 'o'};
        // this method passes the characters to the constructor
        String bilboString = new String(bilboArray);
        System.out.println(bilboString);

        String idol = "Mrs. Hopper";
        if (idol.startsWith("Mrs."))
        {
            System.out.println("Correct!");
        }
        else if (idol.startsWith("Mr."))
        {
            System.out.println("Incorrect!");
        }

        String idol2 = "Maria Skladowska";
        if (idol2.endsWith("a"))
        {
            System.out.println("Correct!");
        }
        else
        {
            System.out.println("Incorrect!");
        }
    }
}
