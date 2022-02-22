package com.company;
import java.util.Random;

public class Losowanie extends ButtonPanel{     // Klasa w ktorej wywołujemy losowania

    Random rand = new Random();

    int Losowanie(int maxlos)       //losowanie liczby do ruletki
    {
        int wylosowana = rand.nextInt(maxlos);
        return wylosowana;
    }

    int LosowanieZnaku()
    {
        int znak = rand.nextInt(3);     // wybor znaku +, -, lub *
        return znak;
    }

    int LosowanieLiczby1()
    {
        int liczba1 = rand.nextInt(100) + 1;    // wybor liczby1 od 1 do 100.
        return liczba1;
    }

    int LosowanieLiczby2()
    {
        int liczba2 = rand.nextInt(100) + 1; // wybor liczby2 od 1 do 100.
        return liczba2;
    }

}
