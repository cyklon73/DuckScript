package de.cyklon.duckscript.lang;

public enum FileExtensions {
    UNKNOW("unknow", "UNKNOW"),
    TXT("txt", "Text"),
    MP3("mp3", "AudioFile"),
    MP4("mp4", "VideoFile"),
    DS("ds", "DuckScript"),
    JS("js", "JavaScript"),
    JAVA("java", "Java"),
    PY("py", "Python");

    private final String extension;
    private final String description;

    FileExtensions(String extension, String description) {
        this.extension = extension;
        this.description = description;
    }

    public String getExtensionString() {
        return extension;
    }

    public String getFileDescription() {
        return description;
    }
}
