package de.cyklon.duckscript.lang.exceptions;

public class InterpreterException extends CompilerException {
    @java.io.Serial
    static final long serialVersionUID = 7818375828146090155L;


    public InterpreterException() {
        super();
    }


    public InterpreterException(String message) {
        super(message);
    }


    public InterpreterException(String message, Throwable cause) {
        super(message, cause);
    }


    public InterpreterException(Throwable cause) {
        super(cause);
    }
}
