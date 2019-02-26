package Week1OfMooc;

public class CalculationsAndOperators
{
    public static void main(String[] args)
    {
        int first = 2;
        int second = 4;
        int sum = first + second;
        System.out.println(sum);

        int calcWithParens = (1+1);
        int newCalc = 2 * calcWithParens; // result is 4, instead of 3 without parentheses
        System.out.println(newCalc);

        first = 5;
        second = 3;
        double result1 = first / (double)second;    // typecasting done right
        double result2 = (double)(second / first);  // incorrect typecasting due to order of operations
        System.out.println(String.format("%.2f", result1));
        System.out.println(String.format("%.5f", result2));

        first = 3;
        second = 2;
        result2 = first / ( second * 1.0);
        System.out.println(result2);

        System.out.println("Exercise:");
        int year = 365;
        int day = 24;
        int hour = 3600;

        int secondsInYear = hour * day * year;
        System.out.println("There are " + secondsInYear + " seconds in a year.");









    }
}
