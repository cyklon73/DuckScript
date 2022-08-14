package de.cyklon.duckscript.ide.util;

import java.awt.*;
import java.net.URL;

public class Util {

    public static URL getResource(String name) {
        return Util.class.getResource(name);
    }

    public static Image getImageResource(String name) {
        return Toolkit.getDefaultToolkit().getImage(getResource(name));
    }

}
