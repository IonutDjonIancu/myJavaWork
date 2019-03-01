package UdemyCertification.tutorials.basic;

public class Arrays
{
    public static void main(String[] args)
    {
        int x = 5; // creating that one box in memory that can store one int value
        int[] myArr; // declaration to store ints
        myArr = new int[4]; // initializations of array of size 4 ints

        myArr[0] = x;
        myArr[1] = 3;
        myArr[2] = 0;
        myArr[3] = 1;

        // iterating over an array
        for (int i = 0; i < myArr.length; i++)
        {
            System.out.print(myArr[i] + " ");
        }
        System.out.println("");
        for (int i : myArr)
        {
            System.out.print(i + " ");
        }

        int[] myArr2 = new int[50];
        for (int i = 0; i < myArr2.length; i++)
        {
            myArr2[i] = i + 1;
        }
        System.out.println("");
        for (int i : myArr2)
        {
            System.out.print(i + " ");
        }

        System.out.println("");
        int[] myArr3 = new int[] {1, 2, 3, 4, 5};
        for (int i : myArr3)
        {
            System.out.print(i + " ");
        }

        System.out.println("\n");
        Person[] people = new Person[3];
        Person john = new Person("John");
        Person mark = new Person("Mark");
        Person jane = new Person("Jane");
        people[0] = john; // object reference variable
        people[1] = mark;
        people[2] = jane;

        for (Person i : people)
        {
            System.out.println(i.getName());
        }

        String s = java.util.Arrays.toString(myArr);
        System.out.println(s);



    }
}
