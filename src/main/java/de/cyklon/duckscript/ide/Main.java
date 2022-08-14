package de.cyklon.duckscript.ide;

import de.cyklon.duckscript.lang.FileHelper;
import de.cyklon.duckscript.lang.exceptions.CompilerException;
import de.cyklon.duckscript.lang.interpreter.Interpreter;

import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Main extends JFrame {

    private boolean darkMode = false;
    private static final File temp = new File(System.getProperty("user.dir"));

    public Main() {
        int height = 600, width = 1000;

        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(d.width / 2 - width / 2, d.height / 2 - height / 2);
        Image duck = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/DuckIcon.png"));
        setIconImage(duck);
        setResizable(false);
        setSize(width, height);
        setTitle("DuckScript - IDE");
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea();
        //textArea.setBounds(80, 55, 600, 450);
        JScrollPane scroll = new JScrollPane(textArea);
        scroll.setBounds(80, 55, 600, 450);

        JButton startButton = new JButton();
        startButton.setBounds(800, 20, 20, 20);
        startButton.setBackground(new Color(0, 169, 3));
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                run(textArea.getText());
            }
        });
        add(startButton);

        if (darkMode) {
            getContentPane().setBackground(new Color(40, 40, 40));

            textArea.setBackground(new Color(50, 50, 50));
            textArea.setForeground(new Color(200, 200, 200));

            scroll.getVerticalScrollBar().setBackground(new Color(50, 50, 50));
            scroll.getHorizontalScrollBar().setBackground(new Color(50, 50, 50));
            scroll.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
                @Override
                protected void configureScrollBarColors() {
                    this.thumbColor = new Color(200, 200, 200);
                }
            });
            scroll.getHorizontalScrollBar().setUI(new BasicScrollBarUI() {
                @Override
                protected void configureScrollBarColors() {
                    this.thumbColor = new Color(200, 200, 200);
                }
            });
        } else {
            getContentPane().setBackground(new Color(220, 220, 220));

            textArea.setBackground(new Color(180, 180, 180));
        }
        add(scroll);

        setVisible(true);
    }

    private static void run(String code) {
        try {
            File path = new File(temp, "temp.ds");
            FileHelper.writeFile(code, path);
            Interpreter.interpret(path);
        } catch (IOException | CompilerException e) {
            throw new RuntimeException(e);
        }
    }

}
