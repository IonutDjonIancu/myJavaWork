package com.company;

public class mainAndClasses
{
    public static void main (String[] args)
    {
        mainAndClasses a = new mainAndClasses();
        System.out.println(a.triple(3));
        blanks();

        double mpg = 26.9;
        //convert() is called without a prior instance of class Car
        double kpl = Car.convert(mpg);
        System.out.println(kpl);
        blanks();

    }

    static void blanks ()
    {
        System.out.println("=================");
    }

    int triple (int number)
    {
        return number*3;
    }
}

class Car
{
    static double convert (double m)
    {
        return m * 0.425143707;
    }

}

