package UdemyCertification.tutorials.basic;

public class Constants
{
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    public static final Person JIM = new Person("Jim");
    public static final int NUM_ENEMIES = 5;

    public static void main(String[] args)
    {
        System.out.println(String.format("%.2f", Math.PI)); // PI is a static constant

        System.out.println(Constants.WIDTH); // can now be used anywhere in the code
        System.out.println(Constants.HEIGHT);
        System.out.println(Constants.JIM); // this prints the address of the object to which JIM is referencing to
        System.out.println(Constants.JIM.getName()); // will print the return value of the method getName() to which JIM variable references to

        System.out.println(Constants.NUM_ENEMIES - 1);




    }
}
