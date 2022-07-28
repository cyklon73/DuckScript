package de.cyklon.duckscript.lang.exceptions;

public class CompilerException extends Exception {
    @java.io.Serial
    static final long serialVersionUID = 7818375828146090155L;


    public CompilerException() {
        super();
    }


    public CompilerException(String message) {
        super(message);
    }


    public CompilerException(String message, Throwable cause) {
        super(message, cause);
    }


    public CompilerException(Throwable cause) {
        super(cause);
    }
}
