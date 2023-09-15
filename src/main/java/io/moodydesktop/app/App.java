package io.moodydesktop.app;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;

public class App 
{
    public static void main( String[] args )
    {
        Border border = BorderFactory.createLineBorder(Color.green, 3);
        //ImageIcon image = new ImageIcon(""); relative path.
        JLabel label = new JLabel(); //create label.
        label.setText("Bro, do you even code?"); //set text of label
        //label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //LEFT, CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); //TOP, CENTER, BOTTOM of imageicon
        label.setForeground(Color.green);
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label.setIconTextGap(-25); //adjust gap between text and image
        label.setBackground(Color.black);
        label.setOpaque(true); //display background color.
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position icon+text within label
        //label.setBounds(100, 100, 250, 250);

        Frame myFrame = new Frame();
        myFrame.add(label);
        myFrame.pack();

    }
}
