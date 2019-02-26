package Week1OfMooc;

public class ConcatenationAndStrings
{
    public static void main(String[] args)
    {
        String greeting = "Hi ";
        String name = "John";
        String goodbye = ", and goodbye!";

        String sentence = greeting + name + goodbye;
        System.out.println(sentence);

        int x = 5;
        int y = 7;
        System.out.print(String.format("The result of %d + %d is %d\n", x, y, x+y));
        System.out.print("The result of " + x + " + " + y + " is " + (x+y) + "\n");

        System.out.println("Exercise:");
        int num1 = 5;
        int num2 = 4;
        int result = num1 + num2;
        System.out.println(result);
        num1 = 73_457;
        num2 = 12_888;
        result = num1 + num2;
        System.out.println(result);
        num1 = 2;
        num2 = 8;
        int multiply = num1 * num2;
        System.out.println(multiply);
        num1 = 277;
        num2 = 111;
        multiply = num1 * num2;
        System.out.println(multiply);
    }
}
