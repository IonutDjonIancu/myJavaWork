package game;

public abstract class GameObject
{
    public abstract void draw();

    public static void main(String[] args)
    {
        // this return an error GameObject gameObject = new GameObject();
        // abstract classes exist only to be extended by other subclasses
        // abstract classes cannot be instantiated

        //GameObject player = new Player();
        Player player = new Player();
        // player.draw();

        GameObject menu = new Menu();
        // menu.draw();

        GameObject[] objects = new GameObject[2];
        objects[0] = player;
        objects[1] = menu;

        for (GameObject obj : objects)
        {
            obj.draw();
        }

        ((Player) player).someMethod(); // this method call from a method defined in player has to casted to player object due to the fact that player has not been instantiated as a player object it has been instantiated as a GameObject object

    }

}
