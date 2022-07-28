package de.cyklon.duckscript.lang.function;

import de.cyklon.duckscript.lang.variable.Value;

public class Parameter {

    private final String name;
    private final Value value;

    public Parameter(String name, Value value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Value getValue() {
        return value;
    }


}
