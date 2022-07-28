package de.cyklon.duckscript.lang.variable;

import de.cyklon.duckscript.lang.DuckScript;
import de.cyklon.duckscript.lang.object.ObjectRepresentation;

public class Variable {

    private final String name;
    private Value value;

    public Variable(String name, Value value) {
        this.name = name;
        this.value = value;
        new ObjectRepresentation().setValue(value, name);
    }

    public String getName() {
        return name;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

}
