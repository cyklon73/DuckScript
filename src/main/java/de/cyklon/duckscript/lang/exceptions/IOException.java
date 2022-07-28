package de.cyklon.duckscript.lang.exceptions;

public class IOException extends InterpreterException {
    @java.io.Serial
    static final long serialVersionUID = 7818375828146090155L;

    public IOException() {
        super();
    }

    public IOException(String message) {
        super(message);
    }

    public IOException(String message, Throwable cause) {
        super(message, cause);
    }

    public IOException(Throwable cause) {
        super(cause);
    }
}
