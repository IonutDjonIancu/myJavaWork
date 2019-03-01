package UdemyCertification.tutorials.basic;

public class Scope
{
    // x is in scope to all methods
    static int x; // declaring the variable x

    public static void main(String[] args)
    {
        x = 5; // assigning a value to x
        System.out.println(x);
        DoSomething();
        System.out.println(x);




    }

    static void DoSomething()
    {
        x = 10;
    }

    static void DoSomethingLocally()
    {
        // because y is declared inside this method it is local to this method
        int y = 100; // declaring and initializing
    }

}
