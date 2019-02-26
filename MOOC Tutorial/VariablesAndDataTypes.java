package Week1OfMooc;

public class VariablesAndDataTypes
{
    public static void main(String[] args)
    {
        String text = "includes text";
        int wholeNumber = 123;
        double decimalNumber = 3.14;
        boolean isTrue = true;

        System.out.println("The variable's type is text. Its value is " + text);
        System.out.println("The variable's type is integer. Its value is " + wholeNumber);
        System.out.println("The variable's type is decimal. Its value is " + decimalNumber);
        System.out.println("The variable's type is boolean. Its value is " + isTrue);

        wholeNumber = 42;
        System.out.println("The variable's type is integer. Its value is " + wholeNumber);

        System.out.println("-----------------------");

        int chickens = 3;
        double bacon = 5.5;
        String tractor = "There is none!";

        System.out.println("Chickens:" + "\n" + chickens);
        System.out.println("Bacon (kg):" + "\n" + bacon);
        System.out.println("A tractor:" + "\n" + tractor);
        System.out.println("In a nutshell:" + "\n" + chickens + "\n" + bacon + "\n" + tractor);

        System.out.println();
        chickens = 9000;
        bacon = 0.1;
        tractor = "Zetor";

        System.out.println("Chickens:" + "\n" + chickens);
        System.out.println("Bacon (kg):" + "\n" + bacon);
        System.out.println("A tractor:" + "\n" + tractor);
        System.out.println("In a nutshell:" + "\n" + chickens + "\n" + bacon + "\n" + tractor);

        System.out.println("-----------------------");



















    }
}
