package com.company;

import java.util.Arrays;

public class BasicArrays
{
    public static void main (String[] args)
    {
        String[] myArray;
        myArray = new String[10];

        String[] names = {"See", "how", "short", "this", "is"};
        System.out.println(Arrays.toString(names));
        String output;
        output = Arrays.toString(names);
        System.out.println(output);
        System.out.println(names.length);
        System.out.println(names[0]);

        int[] nums = {};
        System.out.println(Arrays.toString(nums) + nums.length);

        int[] numbers = {1, 2, 3, 4, 4};
        numbers[4] = 5;
        System.out.println(Arrays.toString(numbers));

        int[] newNumbers;
        newNumbers = new int[4];

    }
}
