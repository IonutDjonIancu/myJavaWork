package UdemyCertification;

public class Methods
{
    public static void main(String[] args)
    {
        SayHelloWorld();

        SayHelloTo("Mark");

        int x = ReturnFive();
        System.out.println(x);

        int result = Square(ReturnFive());
        System.out.println(result);

        System.out.println(Square(ReturnFive()));


    }

    // this method both returns a value and takes in data as a parameter
    static int Square(int x)
    {
        return x * x;
    }

    // this method returns an int type with the value 5
    static int ReturnFive()
    {
        return 5;
    }

    // this method will say hello to whatever name is passed when called
    static void SayHelloTo(String name)
    {
        System.out.println("Hello, " + name);
    }

    // this method simply says hello world
    static void SayHelloWorld()
    {
        System.out.println("Hello, world!");
    }
}
