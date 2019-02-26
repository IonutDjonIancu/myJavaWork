import java.util.ArrayList;
import java.util.HashMap;

public class ColSam
{
    public static void main(String[] args)
    {
        String title = "Colonel";
        String name = "Sam";
        String shipCpt = title + " " + name;
        System.out.println(shipCpt);
        blanks();

        int numberOfPlanets = 0;
        numberOfPlanets++;
        numberOfPlanets += 2;
        System.out.println(shipCpt + " has visited " + numberOfPlanets + " planets.");
        blanks();

        int tank = 10;
        int water = 51;
        boolean b1 = tank >= 10;
        boolean b2 = water > 50;
        boolean hyperspeed = b1 && b2;
        System.out.println("Hyperspeed is " + hyperspeed + ".");
        blanks();

        int planetCount;
        planetCount = 100;
        int goal = 400;
        if (planetCount >= goal)
        {
            System.out.println("Congratulations!");
        }
        else
        {
            System.out.println("You still need " + (goal - planetCount) + " planets to go.");
        }
        blanks();

        String[] solarSystems = new String[5];
        solarSystems[0] = "Pagh";
        solarSystems[1] = "Wa";
        solarSystems[2] = "Cha";
        solarSystems[3] = "Wej";
        solarSystems[4] = "system5";

        int systemCount = 1;
        systemCount++;
        System.out.println(shipCpt + " -> " + solarSystems[systemCount-1]);
        blanks();

        String[] waPlanets = {"Qabaa", "Qabbb", "cc", "Qabdd"};
        for ( String i : waPlanets )
        {
            if (i.startsWith("Qab"))
            {
                System.out.println("inhospitable planet");
            }
            else
            {
                System.out.println(shipCpt + " -> " + i);
                break;
            }
        }
        blanks();

        ArrayList<String> items = new ArrayList<>();
        items.add("pass");
        items.add("control stick");
        items.add("fuel");
        items.remove(0);
        System.out.println("items left for next jump: " + String.join(", ", items));
        blanks();

        HashMap<String, String> crew = new HashMap<>();
        crew.put("Mac", "Mackey");
        crew.put("Pal", "Palchinsky");
        crew.put("Dan", "Daniels");
        crew.put("Nor", "Norton");
        System.out.println(crew.get("Nor") + " is called to deck.");
        blanks();

        HashMap<Double, String> chaPlanets = new HashMap<>();
        String closestPlanet = null;
        chaPlanets.put(4.33, "ChaOne");
        chaPlanets.put(2.81, "ChaTwo");
        chaPlanets.put(5.44, "ChaThree");
        chaPlanets.put(1.98, "ChaFour");
        double x = 9.99;
        for (double y : chaPlanets.keySet())
        {
            if (y <= x)
            {
                closestPlanet = chaPlanets.get(y);
                x = y;
            }
            else
            {
                closestPlanet = chaPlanets.get(x);
            }
        }
        System.out.println("Closest planet is -> " + closestPlanet);
        blanks();

        double shipSpeed = 0.12;
        Double[] distances = {1.98, 2.81, 4.33, 5.44};

        for (double i : distances)
        {
            double eta = calculateEta(i, shipSpeed);
            System.out.println("Time to " + chaPlanets.get(i) + " from the Sun is " + eta + " minutes.");
        }
        blanks();

        Ships ourShip = new Ships("NX-01", "Therazine", 29.88 );
        System.out.println(ourShip.type);
        ourShip.shipID();
        blanks();

        String reader1 = "Jar";
        String reader2 = "not Jar";
        Message newMessage = new Message();
        newMessage.reader(reader1);
        newMessage.reader(reader2);
        blanks();




    }

    static double calculateEta (double distance, double speed)
    {
        return distance/speed;
    }

    static void blanks ()
    {
        System.out.println("=============================");
    }
}

class Ships
{
    String type;
    String fuel;
    double water;

    void shipID()
    {
        System.out.println("You are cleared for takeoff!");
    }

    Ships (String shipType, String shipFuel, double shipWater)
    {
        type = shipType;
        fuel = shipFuel;
        water = shipWater;
    }
}

class Message
{
    private String s = "Access granted...";

    void reader(String n)
    {
        if (n.equals("Jar"))
        {
            System.out.println(s);
        }
        else
        {
            System.out.println("Access denied!");
        }
    }
}