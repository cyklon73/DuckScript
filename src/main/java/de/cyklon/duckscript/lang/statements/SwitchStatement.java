package de.cyklon.duckscript.lang.statements;

import java.util.ArrayList;

public class SwitchStatement implements Statement {

    private Runnable def;
    private ArrayList<Case> cases = new ArrayList<>();

    public SwitchStatement(Runnable def, ArrayList<Case> cases) {
        this.def = def;
        this.cases = cases;
    }


    @Override
    public void execute(Object o) {
        boolean rightCase = false;
        for (Case c : cases) {
            if (c.getCaseValue().equals(o)) {
                c.getRunnable().run();
                rightCase = true;
                break;
            }
        }
        if (!rightCase) def.run();
    }
}
