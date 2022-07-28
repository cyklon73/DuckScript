package de.cyklon.duckscript.lang;

import de.cyklon.duckscript.lang.gui.Gui;
import de.cyklon.duckscript.lang.interpreter.Interpreter;
import de.cyklon.duckscript.lang.compiler.Compiler;
import de.cyklon.duckscript.lang.statements.Case;
import de.cyklon.duckscript.lang.statements.IfStatement;
import de.cyklon.duckscript.lang.statements.Statement;
import de.cyklon.duckscript.lang.statements.SwitchStatement;
import de.cyklon.duckscript.lang.variable.Variable;

import java.io.File;
import java.util.ArrayList;

public class DuckScript {

    public static void main(String[] args) throws Exception {
        /*Statement statement = new IfStatement(new Runnable() {
            @Override
            public void run() {
                System.out.println("test");
            }
        });

        statement.execute(false);


        ArrayList<Case> cases = new ArrayList<>();
        cases.add(new Case(0, new Runnable() {
            @Override
            public void run() {
                System.out.println("Option 0");
            }
        }));
        cases.add(new Case(1, new Runnable() {
            @Override
            public void run() {
                System.out.println("Option 1");
            }
        }));
        statement = new SwitchStatement(new Runnable() {
            @Override
            public void run() {
                System.out.println("default option");
            }
        }, cases);

        statement.execute(2);*/


        //Gui gui = new Gui();
        //Interpreter.interpret(new File("D:\\Development\\Java\\Andere Projekte\\Programmiersprachen\\HQ9pInterpreter\\DuckScript\\src\\main\\resources\\source.ds"));
        //Compiler.compile(new File("D:\\Development\\Java\\Andere Projekte\\Programmiersprachen\\HQ9pInterpreter\\DuckScript\\src\\main\\resources\\source.js"));
        //Compiler.compile(new File("C:\\Users\\cyklo\\Documents\\DuckClient-Features.txt"));
        /*new Variable("testVariable1", new Value(10));
        new Variable("testVariable2", new Value(11));
        System.out.println(getVar("testVariable1").getValue().getValue());
        System.out.println(getVar("testVariable2").getValue().getValue());*/

    }

}
