package org.gameloft.Arrays;

public class Arrays
{
    public static void main(String[] args)
    {
        // Array declaration
        int intArray1[] = null;
        System.out.println(intArray1);
        int intArray2[] = new int[2];   // this is the correct declaration
        System.out.println(intArray2);
        System.out.println(intArray2.length);

        // Array initialization
        intArray2[0] = 100;
        intArray2[1] = 100;

        // Array declaration + initialization
        int intArray3[] = {1000, 2000, 3000};
        System.out.println(intArray3[2]);
        System.out.println(intArray3.length);
        System.out.println("---------");

        // Iterating through an array
        // while
        String arr4[] = {"one", "two", "three"};
        //System.out.println(arr4.length);

        boolean i = true;
        int j = 2;
        while (i)
        {
            System.out.println(arr4[j]);
            j--;
            if (j == -1)
            {
                i = false;
            }
        }
        System.out.println();

        // for i
        for (int k = 2; k > -1; k--)
        {
            System.out.println(arr4[k]);
        }
        System.out.println();

        // for each

        int m = 2;
        for ( String l : arr4)
        {
            System.out.println(arr4[m]);
            m--;
        }
        System.out.println("---------");





    }
}
