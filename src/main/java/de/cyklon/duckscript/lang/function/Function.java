package de.cyklon.duckscript.lang.function;

import de.cyklon.duckscript.lang.variable.Value;

public abstract class Function {

    private String name;

    public Function(String name) {
        this.name = name;
    }

    public abstract Value invoke(Parameter... p);

    public String getName() {
        return name;
    }
}
