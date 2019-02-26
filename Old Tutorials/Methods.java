package com.company;

public class Methods
{
    public static void main (String[] args)
    {
        sayhi();
        blanks();

        int number = triple(4);
        System.out.println(number);
        blanks();

        int numbers;
        System.out.println(numbers = triple(24));
        blanks();

        String[] myFriends = {"Ben", "Luke", "Leia"};

        friends(myFriends);
        blanks();

        int s = totalize(2, 3, 4) + totalize(10, 20);
        System.out.println(s);
        blanks();

        int[] myNumbers = {3, -4, 5};
        process(myNumbers);
        blanks();

        System.out.println(factorial(3));
        blanks();



    }

    static void sayhi ()
    {
        System.out.println("hello world");
    }

    static void blanks ()
    {
        System.out.println("===================");
    }

    static int triple (int x)
    {
        return x*3;
    }

    static void friends (String[] people)
    {
        String output = "";
        for (String p : people)
        {
            output += "Hi " + p + "! ";
        }
        System.out.println(output);
    }
    // inside main
    // friends(myFriends);

    static int totalize (int... numbers)
    {
        int result = 0;
        for (int i : numbers)
        {
            result += i;
        }
        return result;
    }
    // inside main
    // totalize(1, 2, 3, 4, 5)

    static int multiplyByFive (int number)
    {
        return number * 5;
    }

    static void process (int[] myNumbers)
    {
        for (int n : myNumbers)
        {
            n = multiplyByFive(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
    // inside main
    // process(arrayName);

    static int factorial(int n)
    {
        if (n > 0)
        {
            return (n * factorial(n-1));
        }
        else
        {
            return 1;
        }
    }


}













