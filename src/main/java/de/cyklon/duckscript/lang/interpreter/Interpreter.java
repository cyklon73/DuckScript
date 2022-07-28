package de.cyklon.duckscript.lang.interpreter;

import de.cyklon.duckscript.lang.FileExtensions;
import de.cyklon.duckscript.lang.Reader;
import de.cyklon.duckscript.lang.Util;
import de.cyklon.duckscript.lang.exceptions.CompilerException;
import de.cyklon.duckscript.lang.exceptions.InvalidFileException;
import de.cyklon.duckscript.lang.exceptions.MissingComponentException;
import de.cyklon.duckscript.lang.gui.Gui;

import javax.swing.*;
import java.io.File;

public class Interpreter {

    private static Gui gui = null;


    public static void main(String[] args) throws CompilerException {
        interpret(new File(args[0]));
    }
    public static void interpret(File file) throws CompilerException {
        FileExtensions fileExtension = Util.getFileExtension(file);
        if (!fileExtension.equals(FileExtensions.DS)) throw new InvalidFileException(Util.convertMessage("das datei format `" + fileExtension.getFileDescription() + "` wird nicht unterstützt"));

        Reader reader = new Reader(file);

        String line = "";
        boolean mulitComment = false;
        while (true) {
            line = reader.nextLine();
            if (line == null) break;
            String lineWithoutSpace = Util.removeSpaces(line);
            if (line.startsWith("~~") || line.equals("~~")) mulitComment = true;
            if (!mulitComment) {
                if (!(line.startsWith("~"))) {
                    print(line);
                    if (line.startsWith("System.Console.print(")) {
                        String[] args = line.split("print\\(\"");
                        String[] args2 = args[1].split("\"\\)");
                        try {
                            if (!args2[1].startsWith(";")) throw new MissingComponentException(" `;` awaited");
                        } catch (IndexOutOfBoundsException e) {
                            throw new MissingComponentException(" `;` awaited");
                        }
                        System.out.println(args2[0]);
                    }
                    if (line.startsWith("Window.create()")) {
                        String[] args = line.split("\\(\\)");
                        try {
                            if (!(args[1].startsWith(";") || args[1].equals(";"))) throw new MissingComponentException(" `;` awaited");
                        } catch (IndexOutOfBoundsException e) {
                            throw new MissingComponentException(" `;` awaited");
                        }
                        gui = new Gui();
                    }
                    if (line.startsWith("Window.setIcon(")) {
                        String[] args = line.split("setIcon\\(\"");
                        String[] args2 = args[1].split("\"\\)");
                        try {
                            if (!args2[1].startsWith(";")) throw new MissingComponentException(" `;` awaited");
                        } catch (IndexOutOfBoundsException e) {
                            throw new MissingComponentException(" `;` awaited");
                        }
                        gui.setIcon(new File(args2[0]));
                    }
                    if (line.startsWith("Window.setTitle(")) {
                        String[] args = line.split("setTitle\\(\"");
                        String[] args2 = args[1].split("\"\\)");
                        try {
                            if (!args2[1].startsWith(";")) throw new MissingComponentException(" `;` awaited");
                        } catch (IndexOutOfBoundsException e) {
                            throw new MissingComponentException(" `;` awaited");
                        }
                        gui.setTitle(args2[0]);
                    }
                    if (line.startsWith("Window.setResizable(")) {
                        String[] args = line.split("setResizable\\(");
                        String[] args2 = args[1].split("\\)");
                        try {
                            if (!args2[1].startsWith(";")) throw new MissingComponentException(" `;` awaited");
                        } catch (IndexOutOfBoundsException e) {
                            throw new MissingComponentException(" `;` awaited");
                        }
                        gui.setResizable(Boolean.parseBoolean(args2[0]));
                    }
                    if (line.startsWith("Window.setSize(")) {
                        String[] args = line.split("setSize\\(");
                        String[] args1 = args[1].split("\\)");
                        String[] args2 = args1[0].split(",");
                        try {
                            if (!args1[1].startsWith(";")) throw new MissingComponentException(" `;` awaited");
                        } catch (IndexOutOfBoundsException e) {
                            throw new MissingComponentException(" `;` awaited");
                        }
                        gui.setSize(Integer.parseInt(Util.removeSpaces(args2[0])), Integer.parseInt(Util.removeSpaces(args2[1])));
                    }
                    if (line.startsWith("Window.error.fakeVirus.create()")) {
                        String[] args = line.split("\\(\\)");
                        try {
                            if (!(args[1].startsWith(";") || args[1].equals(";"))) throw new MissingComponentException(" `;` awaited");
                        } catch (IndexOutOfBoundsException e) {
                            throw new MissingComponentException(" `;` awaited");
                        }
                        while (true) JOptionPane.showConfirmDialog(null, "your pc has virus!", "Error", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
                    }
                }
                else {
                    print("comment -> " + line);
                }
            } else {
                print("comment -> " + line);
            }
            if (line.endsWith("~~") || line.equals("~~")) mulitComment = false;
        }

    }

    private static void print(String msg) {
        //System.out.println("Line -> " + msg);
    }

}
