package io.moodydesktop.app;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;

public class App 
{
    public static void main( String[] args )
    {
        Label label = new Label();

        Frame myFrame = new Frame();
        myFrame.add(label);
        myFrame.pack();

    }
}
