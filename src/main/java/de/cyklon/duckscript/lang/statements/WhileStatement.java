package de.cyklon.duckscript.lang.statements;

public class WhileStatement implements Statement {

    private Runnable runnable;

    public WhileStatement(Runnable runnable) {
        this.runnable = runnable;
    }

    @Override
    public void execute(Object o) {

    }
}
