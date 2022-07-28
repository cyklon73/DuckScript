package de.cyklon.duckscript.lang.gui;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Gui {

    private final Window window;

    public Gui() {
        window = new Window();
    }

    public void setTitle(String title) {
        window.setTitle(title);
    }

    public void setResizable(boolean resizable) {
        window.setResizable(resizable);
    }

    public void setSize(int width, int height) {
        window.setSize(width, height);
    }

    public void setIcon(File file) {
        Image icon = Toolkit.getDefaultToolkit().getImage(file.getAbsolutePath());
        window.setIconImage(icon);
    }

}
