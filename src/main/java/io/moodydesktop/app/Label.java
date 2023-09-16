package io.moodydesktop.app;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.Border;
import java.awt.Font;

public class Label extends JLabel {
    public Label() {
        Border border = BorderFactory.createLineBorder(Color.green, 3);
        //ImageIcon image = new ImageIcon(""); relative path.
        this.setText("Bro, do you even code?"); //set text of label
        //label.setIcon(image);
        this.setHorizontalTextPosition(JLabel.CENTER); //LEFT, CENTER, RIGHT of imageicon
        this.setVerticalTextPosition(JLabel.TOP); //TOP, CENTER, BOTTOM of imageicon
        this.setForeground(Color.green);
        this.setFont(new Font("MV Boli", Font.PLAIN, 20));
        this.setIconTextGap(-25); //adjust gap between text and image
        this.setBackground(Color.black);
        this.setOpaque(true); //display background color.
        this.setBorder(border);
        //this.setVerticalAlignment(JLabel.BOTTOM); //set vertical position of icon+text within label
        //this.setHorizontalAlignment(JLabel.RIGHT); //set horizontal position icon+text within label
        //label.setBounds(100, 100, 250, 250);
    }
    
}
