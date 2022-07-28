package de.cyklon.duckscript.lang;

import de.cyklon.duckscript.lang.exceptions.InterpreterException;

import java.io.*;

public class Reader {

    private final String content;
    private int line = 0;

    public Reader(File file) throws InterpreterException {
        try {
            this.content = FileHelper.readFile(file);
        } catch (IOException e) {
            throw new de.cyklon.duckscript.lang.exceptions.IOException(e);
        }
    }

    public String nextLine() {
        line++;
        try {
            String l = getLine(line);
            while (l == null) {
                line++;
                l = getLine(line);
            }
            return l;
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    public String getLine(int line) throws IndexOutOfBoundsException {
        String[] lines = content.split("\n");
        String l = lines[line-1];
        if (Util.removeSpaces(l) == "") return null;
        else return l;
    }



}
