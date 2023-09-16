package io.moodydesktop.app;

import javax.swing.JPanel;
import java.awt.Color;

public class Panel extends JPanel{
    public Panel(Color color, int x, int y, int width, int height) {
        this.setBackground(color);
        this.setBounds(x, y, width, height);
    }
}
