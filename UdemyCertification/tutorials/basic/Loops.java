package UdemyCertification.tutorials.basic;

public class Loops
{
    public static void main(String[] args)
    {
        ForLoop();

    }

    static void ForLoop()
    {
        for (int counter = 1; counter <= 10; counter++)
        {
            System.out.println(counter);
        }

    }

    static void DoWhileLoop()
    {
        int counter = 0;
        do
        {
            counter++;
            System.out.println(counter);
        }
        while (counter < 10);
    }

    static void WhileLoop()
    {
        int counter = 0;

        while (counter < 10)
        {
            counter++;
            System.out.println(counter);
        }
    }
}
