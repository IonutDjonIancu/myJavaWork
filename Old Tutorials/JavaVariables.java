package org.gameloft.java_variables;

public class JavaVariables
{
    public static void main(String[] args)
    {
        // Numeric data types (aka numeric variables)
        // https://cs.fit.edu/~ryan/java/language/java-data.html
        // [Primitive data types]
        // - Whole numbers
        // - Floating point numbers

        // whole numbers:
        byte myByte = 0;    // 1 byte
        short myShort;      // 2 bytes
        int myInt;          // 4 bytes [used as default]
        long myLongInt = 0L;// 8 bytes [must use L/l at the end of the number]

        // floating point numbers:
        float myFloat = 0F; // 8 bytes [must use F/f at the end of the number]
        double myDouble;    // 16 bytes


        // Non-numeric data types (aka non-numeric variables)
        // [Primitive data types]
        // - Booleans
        // - Chars

        // boolean:
        boolean myFlag = true;
        myFlag = false;

        // chars:
        char myChar = 'A';


        // Strings
        // classified as non_primitive data types
        // in Java Strings are objects
        String myString = "this is a string";
        String myString2 = ", this is another string";
        String myString3 = ", this is yet another string";
        System.out.println(myString + myString2 + myString3);


















    }


}
