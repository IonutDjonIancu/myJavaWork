package overriding;

import javax.swing.*;
import java.awt.*;

public class Drawing extends JFrame
{
    public static void main(String[] args)
    {
        new Drawing();



    }

    public Drawing()
    {
         setSize(500, 500);
         setVisible(true);
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawRect(50, 50, 100, 25); // draws a rectangle on the window

        g.setColor(new Color(0, 0, 255)); // sets a new RGB user defined color
        g.drawOval(200, 50, 50, 50);

        g.setColor(Color.GREEN); // sets the color by statically referring to predefined colors
        g.fillRect(51, 51, 99, 24);

        g.setColor(Color.ORANGE);
        g.drawString("My String", 175, 175);


    }
}
