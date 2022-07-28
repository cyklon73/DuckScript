package de.cyklon.duckscript.lang.object;

import de.cyklon.duckscript.lang.function.Function;
import de.cyklon.duckscript.lang.function.Parameter;
import de.cyklon.duckscript.lang.variable.Value;
import de.cyklon.duckscript.lang.variable.Variable;

import java.util.*;

public class ObjectRepresentation {

    private List<Variable> values = new ArrayList<Variable>();
    private List<Function> functions = new ArrayList<Function>();

    public void setValue(Value v, String name) {
        for (Variable va: values) {
            if (va.getName().equals(name)) {
                values.remove(va);
                break;
            }
        }
        values.add(new Variable(name, v));
    }

    public Value getValue(String name) {
        for (Variable v: values) {
            if (v.getName().equals(name)) return v.getValue();
        }
        throw new RuntimeException("No value with name " + name + " found!");
    }

    public void setFunction(Function f) {
        for (Function func: functions) {
            if (func.getName().equals(f.getName())) {
                functions.remove(func);
                break;
            }
        }
        functions.add(f);
    }

    public void setFunction(Function f, String name) {
        for (Function func: functions) {
            if (func.getName().equals(name)) {
                functions.remove(func);
                break;
            }
        }
        functions.add(new Function(name) {
            @Override
            public Value invoke(Parameter... p) {
                return f.invoke(p);
            }
        });
    }

    public Function getFunction(String name) {
        for (Function func: functions) {
            if (func.getName().equals(name)) return func;
        }
        throw new RuntimeException("No Function with name " + name + " found!");
    }

}
