package de.cyklon.duckscript.lang.exceptions;

public class MissingComponentException extends InterpreterException {
    @java.io.Serial
    static final long serialVersionUID = 7818375828146090155L;

    public MissingComponentException() {
        super();
    }

    public MissingComponentException(String message) {
        super(message);
    }

    public MissingComponentException(String message, Throwable cause) {
        super(message, cause);
    }

    public MissingComponentException(Throwable cause) {
        super(cause);
    }
}
