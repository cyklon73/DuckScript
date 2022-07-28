package de.cyklon.duckscript.lang.gui;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {


    public Window() {
        int height = 400, width = 400;

        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(d.width/2-width/2, d.height/2-height/2);
        Image duck = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/DuckIcon.png"));
        setIconImage(duck);
        setResizable(true);
        setSize(width, height);
        setTitle("DuckScript - GUI");
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
