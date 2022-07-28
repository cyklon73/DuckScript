package de.cyklon.duckscript.lang.exceptions;

public class InvalidFileException extends InterpreterException {
    @java.io.Serial
    static final long serialVersionUID = 7818375828146090155L;

    public InvalidFileException() {
        super();
    }

    public InvalidFileException(String message) {
        super(message);
    }

    public InvalidFileException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidFileException(Throwable cause) {
        super(cause);
    }

}
