package de.cyklon.duckscript.lang.variable;

public class Value {

    private Object value;
    private boolean primitive = false;

    public Value(Object value) {
        this.value = value;
    }

    public Value(double value) {
        this.value = value;
        primitive = true;
    }

    public Value(boolean value) {
        this.value = value;
        primitive = true;
    }

    public Value(char value) {
        this.value = value;
        primitive = true;
    }

    public Value(int value) {
        this.value = value;
        primitive = true;
    }

    public Value(float value) {
        this.value = value;
        primitive = true;
    }

    public Class<?> getType() {
        if (primitive) {
            if (value.getClass() == Double.class) return double.class;
            else if (value.getClass() == Boolean.class) return boolean.class;
            else if (value.getClass() == Character.class) return char.class;
            else if (value.getClass() == Integer.class) return int.class;
            else if (value.getClass() == Float.class) return float.class;

        }
        return value.getClass();
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        primitive=false;
        this.value = value;
        if (value.getClass() == Double.class) primitive=true;
        else if (value.getClass() == Boolean.class) primitive=true;
        else if (value.getClass() == Character.class) primitive=true;
        else if (value.getClass() == Integer.class) primitive=true;
        else if (value.getClass() == Float.class) primitive=true;
    }

    public boolean isPrimitive() {
        return primitive;
    }
}
