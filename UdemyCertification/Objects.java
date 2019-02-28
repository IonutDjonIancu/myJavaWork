package UdemyCertification;

import javax.swing.*;

public class Objects
{
    public static void main(String[] args)
    {
        int x = 5; // type variableName declaration and initialization

        // create My Window
        JFrame window = new JFrame(); // window variable that holds JFrame objects and we are creating a new JFrame to assign to our variable
        window.setTitle("My Window"); // we are calling methods on our JFrame object to configure it
        window.setSize(800, 600);
        // this is an object property
        window.setVisible(true);

        JLabel label = new JLabel(); // label variable holds JLabel objects
        label.setText("Goood morning");

        window.add(label);

        String str = "hi";
        str.toUpperCase();




    }
}
