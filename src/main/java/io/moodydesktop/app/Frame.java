package io.moodydesktop.app;

import javax.swing.*;

//import javax.swing.ImageIcon;

public class Frame extends JFrame { 
    public Frame() {
        this.setTitle("Moody Desktop App");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit on x button click.
        this.setLayout(null);
        this.setResizable(false); //prevent frame being resized.
        this.setSize(500, 500);
        this.setVisible(true);
        //this.setLayout(null);
        //this.pack();
        //ImageIcon image = new ImageIcon("logo.png"); //create an image icon
        //frame.setIconImage(image.getImage()); //change icon of frame.
        //this.getContentPane().setBackground(new Color(123, 50, 250)); //change color of background.
    }
    
}
