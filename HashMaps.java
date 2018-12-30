package com.company;

import java.util.HashMap;

public class HashMaps
{
    public static void main (String[] args)
    {
        HashMap<String, String> myMap;
        myMap = new HashMap<>();

        boolean emptyHashMap = myMap.isEmpty();
        System.out.println(emptyHashMap);

        HashMap<Integer, String> myMap2 = new HashMap<>();
        myMap2.put(23, "Michael");
        myMap2.put(33, "John");
        myMap2.put(21, "Katherine");

        System.out.println(myMap2.size());
        System.out.println(myMap2.get(21));
        System.out.println(myMap2.toString());
        System.out.println(String.join(", ", myMap2.toString()));

        myMap2.remove(23);
        System.out.println(myMap2);

        myMap2.put(21, "Diana");
        System.out.println(myMap2);



    }
}
