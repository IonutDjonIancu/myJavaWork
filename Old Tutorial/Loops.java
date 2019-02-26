package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class Loops
{
    public static void main (String[] args)
    {
        int counter = 1;
        while (counter < 4)
        {
            System.out.println(counter);
            counter++;
        }
        System.out.println("========================");

        counter = 1;
        do
        {
            System.out.println("this will show at least once");
            counter++;
        }
        while (counter < 2);
        System.out.println("========================");


        for (int i = 1; i <= 4; i++)
        {
            System.out.println("i = " + i);
        }

        for (int i = 4; i > 0; i--)
        {
            System.out.println("i = " + i);
        }
        System.out.println("========================");

        int sum = 0;
        String log = "0";
        for (int i = 1; i < 3; i++)
        {
            sum += i;
            log += " + " + i;
        }
        System.out.println(log + " = " + sum);
        System.out.println("========================");

        int a = 1;
        int b = 1;
        System.out.println("Fibronacci:");
        System.out.print(a + "-" + b);
        for (int i = 1; i <= 5; i++)
        {
            int c = a + b;
            a = b;
            b = c;
            System.out.print("-" + c);
        }
        System.out.println("\n========================");

        String[] friends = new String[3];
        friends[0] = "Ron";
        friends[1] = "Mage";
        friends[2] = "Brom";
        for (String f : friends)
        {
            System.out.print(f + "; ");
        }
        //or
        System.out.println("\n========================");
        System.out.println(Arrays.toString(friends));
        System.out.println("========================");

        HashMap<String, String> footBallTeam = new HashMap<>();
        footBallTeam.put("Goalkeeper", "Mike");
        footBallTeam.put("Defender", "George");
        footBallTeam.put("Midfielder", "Michael");
        footBallTeam.put("Attacker", "Ralph");
        for (String k : footBallTeam.keySet())
        {
            String s = k + " : ";
            s += footBallTeam.get(k) + "; ";
            System.out.println(s);
        }
        System.out.println(footBallTeam.values());
        System.out.println("========================");

        for (int i = 1; i < 5; i++)
        {
            System.out.print(i + ": ");
            int j = i;
            while (j <= 4)
            {
                System.out.print(j);
                j++;
            }
            System.out.print(" || ");
        }
    }
}
