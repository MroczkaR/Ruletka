package com.company;
import java.awt.EventQueue;

public class Main {

    public static void main(String[] args) {    // główna metoda, która wywołuje wszyskie klasy
	    EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ActionFrame();      // uruchamia aplikację okienkową
            }
        });
    }
}


