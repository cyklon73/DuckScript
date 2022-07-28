package de.cyklon.duckscript.lang.compiler;

import de.cyklon.duckscript.lang.Reader;
import de.cyklon.duckscript.lang.Util;
import de.cyklon.duckscript.lang.exceptions.CompilerException;
import de.cyklon.duckscript.lang.exceptions.InvalidFileException;

import java.io.File;

public class Compiler {

    public static void compile(File file) throws CompilerException {
        String fileExtension = file.getName().split("\\.")[1];
        if (!fileExtension.equals("ds")) throw new InvalidFileException(Util.convertMessage("das datei format `" + fileExtension + "` wird nicht unterstützt"));

        Reader reader = new Reader(file);

        String line = "";
        boolean mulitComment = false;
        while (line != null) {
            line = reader.nextLine();
            if (line.startsWith("~~")) mulitComment = true;
            if (!mulitComment) {
                if (!(line.startsWith("~"))) {
                    print(line);
                }
                else {
                    print("comment -> " + line);
                }
            } else {
                print("comment -> " + line);
            }
            if (line.endsWith("~~")) mulitComment = false;
        }

    }

    private static void print(String msg) {
        System.out.println("Line -> " + msg);
    }

}
