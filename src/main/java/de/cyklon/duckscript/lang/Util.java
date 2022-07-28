package de.cyklon.duckscript.lang;

import java.io.File;

public class Util {

    public static String convertMessage(String message) {
        String msg = "";
        for (int i = 0; i < message.length(); i++) {
            switch (message.charAt(i)) {
                case 'ü' -> msg += "ue";
                case 'ä' -> msg += "ae";
                case 'ö' -> msg += "oe";
                default -> msg += message.charAt(i);
            }
        }
        return msg;
    }

    public static FileExtensions getFileExtension(File file) {
        String fileExtension = file.getName().split("\\.")[1];
        for (FileExtensions ext: FileExtensions.values()) {
            if (ext.getExtensionString().equals(fileExtension)) return ext;
        }
        return FileExtensions.UNKNOW;
    }

    public static void runForChar(String message, LetterComp comp) {
        for (int i = 0; i < message.length(); i++) {
            comp.run(message.charAt(i));
        }
    }

    public static String removeSpaces(String message) {
        final String[] msg = {""};
        runForChar(message, new LetterComp() {
            @Override
            public void run(char character) {
                if (character != ' ') msg[0] += character;
            }
        });
        return msg[0];
    }
}
