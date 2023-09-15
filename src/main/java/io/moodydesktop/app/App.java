package io.moodydesktop.app;

import javax.swing.JFrame;

public class App 
{
    public static void main( String[] args )
    {
        JFrame frame = new JFrame();
        frame.setTitle("Moody Desktop App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setVisible(true);
    }
}
