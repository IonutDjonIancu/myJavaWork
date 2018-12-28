package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists
{
    public static void main (String[] args)
    {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Rambo");
        System.out.println(String.join(", ", names));

        String[] myArr = {"aa", "bb", "cc"};
        System.out.println(String.join(", ", myArr));
        System.out.println(Arrays.toString(myArr));

        ArrayList<Double> numbers = new ArrayList<>();

        String john = names.get(0);
        System.out.println(john);

        names.add("");
        names.set(2, "BravoCompany");
        System.out.println(String.join(", ", names));

        names.remove(0);
        System.out.println(String.join(", ", names));

        ArrayList<String> newNumbers = new ArrayList<>();
        if (newNumbers.isEmpty())
        {
            newNumbers.add("1");
        }

        if (newNumbers.size() > 0)
        {
            System.out.println(String.join(", ", newNumbers));
        }


        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Jack");
        names1.add("John");
        names1.add("Kate");
        names1.add("Rose");
        names1.toArray();
        System.out.println(names1);

    }

}
