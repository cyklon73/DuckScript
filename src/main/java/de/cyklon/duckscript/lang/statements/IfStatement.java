package de.cyklon.duckscript.lang.statements;

public class IfStatement implements Statement {

    private Runnable runnable;

    public IfStatement(Runnable runnable) {
        this.runnable = runnable;
    }

    @Override
    public void execute(Object o) {
        if ((boolean)o) runnable.run();
    }
}
