package introduction;

import javax.swing.*;

public class MyWindow extends JFrame
{
    public static void main(String[] args)
    {
            new MyWindow();

    }

    public  MyWindow()
    {
        setSize(800, 600);
        setVisible(true);
        setTitle("My Window");
        JLabel label = new JLabel();
        label.setText("Gooooood morning");
        add(label);
    }
}
