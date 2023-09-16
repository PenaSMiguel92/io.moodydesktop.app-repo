package io.moodydesktop.app;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.Border;
import java.awt.Font;

public class Label extends JLabel {
    Label() {
        Border border = BorderFactory.createLineBorder(Color.green, 3);
        //ImageIcon image = new ImageIcon(""); relative path.
        setText("Bro, do you even code?"); //set text of label
        //label.setIcon(image);
        setHorizontalTextPosition(JLabel.CENTER); //LEFT, CENTER, RIGHT of imageicon
        setVerticalTextPosition(JLabel.TOP); //TOP, CENTER, BOTTOM of imageicon
        setForeground(Color.green);
        setFont(new Font("MV Boli", Font.PLAIN, 20));
        setIconTextGap(-25); //adjust gap between text and image
        setBackground(Color.black);
        setOpaque(true); //display background color.
        setBorder(border);
        setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
        setHorizontalAlignment(JLabel.CENTER); //set horizontal position icon+text within label
        //label.setBounds(100, 100, 250, 250);
    }
    
}
