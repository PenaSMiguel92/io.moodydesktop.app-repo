package io.moodydesktop.app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Button extends JButton implements ActionListener {

    public Button(int x, int y, int width, int height) {
        this.setBounds(x, y, width, height);
        this.addActionListener(this::actionPerformed);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this) {
            System.out.println("poop");
        }
    }
}
