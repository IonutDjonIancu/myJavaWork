package org.gameloft.java_variables;

public class Operations
{
    public static void main(String[] args)
    {
        // Concatenation
        String concatenatedString = "abc" + "123";
        System.out.println(concatenatedString);

        String stringPlusNumber = "" + 12;  // actually converts numbers automatically into Strings
        System.out.println(stringPlusNumber);

        String otherStringPlusNumber = "Current year: " + 2019;
        System.out.println(otherStringPlusNumber);
        System.out.printf("asa");

        // Addition
        System.out.println(5+5);
        int x = 6;
        System.out.println(x + 1);

        // Subtraction
        System.out.println(7 - 2);
        x = 8;
        System.out.println(x - 44);

        // Multiplication
        x *= 2;
        System.out.println(x * 2);

        // Division
        x /= 10;
        System.out.println(x + 4);

        double q = 5.0 / 2;
        System.out.println(q);

        // Modulus
        x %= 2;
        System.out.println(x);

        // Increment operations
        int num1 = 0;
        System.out.println(num1++);
        num1 = 0;
        System.out.println(++num1);

        // Decrement operations
        int num2 = 0;
        System.out.println(num2--);
        num2 = 0;
        System.out.println(--num2);

        // Assignment operations
        int num3;
        num3 = 0;
        num3 += 1;
        num3 *= 1;
        num3 -= 1;
        System.out.println(num3);

        double num4 = 4.0;
        num4 /= 2;
        System.out.println(num4);

        // Modulo assignment
        int a = 8;
        System.out.println(a %= 3);


        // Order of operations
        System.out.println("same as in arithmetic");

        // Negation
        int c = 10;
        c = -c;
        System.out.println(c);
        c = -c;
        System.out.println(c);








    }
}
