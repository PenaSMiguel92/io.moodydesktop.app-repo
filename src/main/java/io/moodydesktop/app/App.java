package io.moodydesktop.app;

import javax.swing.*;
import java.awt.*;

public class App 
{
    public static void main( String[] args )
    {
        Label label = new Label();
        Panel redPanel = new Panel(Color.red, 0, 0, 250, 250);
        Panel bluePanel = new Panel(Color.blue, 250, 0, 250, 250);
        Panel greenPanel = new Panel(Color.green, 0, 250, 500, 250);
        greenPanel.setLayout(new BorderLayout());
        greenPanel.add(label);
        Frame myFrame = new Frame();
        myFrame.add(redPanel);
        myFrame.add(bluePanel);
        myFrame.add(greenPanel);
        //myFrame.add(label);
        //myFrame.pack();

    }
}
