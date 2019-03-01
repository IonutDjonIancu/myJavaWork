package game;

public class Player extends GameObject
{
    public Player()
    {

    }

    public void someMethod()
    {
        System.out.println("Hello");
    }

    @Override
    public void draw()
    {
        System.out.println("Player draw");
    }
}
