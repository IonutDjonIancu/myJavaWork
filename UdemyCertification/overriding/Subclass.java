package overriding;

// Subclass is inheriting all the variables and methods defined in Base
public class Subclass extends Base
{
    public static void main(String[] args)
    {
        Subclass subclass = new Subclass();

    }

    public Subclass()
    {
        SayHello(); // we are calling the SayHello() method defined in superclass Base
    }

    @Override
    public void SayHello() {
        super.SayHello(); // this is the method defined in the Base class
        System.out.println("and Hi!");
    }
}
