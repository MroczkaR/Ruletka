package com.company;

import javax.swing.*;
import java.awt.*;

public class ActionFrame extends JFrame{    // Klasa dotyczaca okna
    public ActionFrame()
    {
        super(("Roulette"));
        JPanel buttonPanel = new ButtonPanel();
        add(buttonPanel);       // Dodajemy głowny panel do naszego okna

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(500, 500);
        pack();
        setVisible(true);

    }
}
