package com.company;

public class BasicBoolean
{
    public static void main (String[] args)
    {
        boolean truth;
        truth = true;
        System.out.println(truth);

        boolean bool = 5 > 3;
        System.out.println(bool);
        System.out.println("==================");

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;
        System.out.println(b1&&b2);
        System.out.println(b1&&b3);
        System.out.println(b2&&b4);
        System.out.println("==================");
        System.out.println(b1||b2);
        System.out.println(b1||b3);
        System.out.println(b2||b4);

    }
}
