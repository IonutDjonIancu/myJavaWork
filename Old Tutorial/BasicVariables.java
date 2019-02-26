package com.company;

public class BasicVariables
{
    public static void main(String[] args)
    {
        String greeting = "greetings";
        var s = 123;
        System.out.println(s + greeting);

        float d = 4.0f;     // float numbers end in f
        double dd = 4.0;    // double numbers are written differently than floats
        System.out.println(d + dd);

        s++;
        System.out.println(s + dd);
    }
}
