package de.cyklon.duckscript.lang.statements;

public class Case {

    private Object caseValue;
    private Runnable runnable;

    public Case(Object caseValue, Runnable runnable) {
        this.caseValue = caseValue;
        this.runnable = runnable;
    }

    public Object getCaseValue() {
        return caseValue;
    }

    public void setCaseValue(Object caseValue) {
        this.caseValue = caseValue;
    }

    public Runnable getRunnable() {
        return runnable;
    }

    public void setRunnable(Runnable runnable) {
        this.runnable = runnable;
    }



}
