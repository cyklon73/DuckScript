package de.cyklon.duckscript.lang;

import java.io.*;

public class FileHelper {

    public static String readFile(final File fileIn) throws IOException {

        final FileReader fileReader = new FileReader(fileIn);
        final BufferedReader buffReader = new BufferedReader(fileReader);
        StringBuilder sb = new StringBuilder();

        String currLine;

        while ((currLine = buffReader.readLine()) != null && !currLine.startsWith("#")) {
            sb.append(currLine + "\n");
        }

        buffReader.close();
        fileReader.close();

        return sb.toString();
    }

    public static void writeFile(String text, File file) throws IOException {
        if (file.exists()) {
            file.delete();
        }
        final PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
        writer.println(text);
        writer.close();
    }

}
