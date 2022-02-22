package com.company;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class ButtonPanel extends JPanel implements ActionListener {     // Głowna klasa, ktora robi wiekszosc rzeczy.
    public static final int HEIGHT = 300;
    public static final int WIDTH = 400;
    public JLabel coinText;
    public JLabel coinText2;
    public JTextField stawka;
    private JLabel info1Text;
    public JLabel wynik;
    private JButton greenButton;
    private JButton blackButton;
    private JButton redButton;
    private JButton earnCoinsButton;
    private JPanel QPanel;
    private JPanel L3Panel;
    private JPanel EarnPanel;
    private JLabel pytanie;
    private JLabel wynikodp;
    private JTextField odpowiedz;
    private JButton odpButton;
    private JButton back;
    private JPanel LPanel;
    int koszt;
    int prawOdp;
    int coins = 100;            // Inicjujemy wszystkie zmienne, które będą nam patrzebne.


    private void createComponents()
    {
        coinText = new JLabel("Coins : 100", SwingConstants.CENTER);
        coinText2 = new JLabel("Coins : 100", SwingConstants.CENTER);
        stawka = new JTextField(10);
        stawka.setHorizontalAlignment(JTextField.CENTER);
        info1Text = new JLabel("Podaj stawkę : ", SwingConstants.CENTER);
        wynik = new JLabel(" ", SwingConstants.CENTER);
        redButton = new JButton("Red");
        greenButton = new JButton("Green");
        blackButton = new JButton("Black");
        earnCoinsButton = new JButton("Zarob Coins");
        pytanie = new JLabel("Ile to jest : 2 + 2", SwingConstants.CENTER);
        wynikodp = new JLabel("  ", SwingConstants.CENTER);
        odpowiedz = new JTextField(10);
        odpowiedz.setHorizontalAlignment(JTextField.CENTER);
        back = new JButton("Wróć");
        odpButton = new JButton("Odpowiedz");
        setBackground(new Color(180, 180, 180));        // Wprowadzamy wartosci tych zmiennych

        //BPanel
        JPanel BPanel = new JPanel();
        BPanel.setLayout(new FlowLayout());
        BPanel.setBackground(new Color(180, 180, 180));
        BPanel.add(redButton);
        BPanel.add(greenButton);
        BPanel.add(blackButton);

        //L2Panel
        JPanel L2Panel = new JPanel();
        L2Panel.setLayout(new BorderLayout());
        L2Panel.setBackground(new Color(180, 180, 180));
        L2Panel.add(wynik, BorderLayout.PAGE_START);
        L2Panel.add(info1Text, BorderLayout.CENTER);
        L2Panel.add(stawka, BorderLayout.PAGE_END);

        //L3Panel
        L3Panel = new JPanel();
        L3Panel.setLayout(new BorderLayout());
        L3Panel.setBackground(new Color(180, 180, 180));
        L3Panel.add(L2Panel, BorderLayout.PAGE_START);
        L3Panel.add(BPanel, BorderLayout.CENTER);

        //QPanel
        QPanel = new JPanel();
        QPanel.setLayout(new FlowLayout());
        QPanel.setBackground(new Color(180, 180, 180));
        QPanel.add(earnCoinsButton);


        //Panelx2
        JPanel Panelx2 = new JPanel();
        Panelx2.setLayout(new BorderLayout());
        Panelx2.setBackground(new Color(180, 180, 180));
        Panelx2.add(wynikodp, BorderLayout.PAGE_START);
        Panelx2.add(odpowiedz, BorderLayout.CENTER);
        Panelx2.add(odpButton, BorderLayout.PAGE_END);

        //Panelx1
        JPanel Panelx1 = new JPanel();
        Panelx1.setLayout(new BorderLayout());
        Panelx1.setBackground(new Color(180, 180, 180));
        Panelx1.add(coinText2, BorderLayout.PAGE_START);
        Panelx1.add(pytanie, BorderLayout.CENTER);
        Panelx1.add(Panelx2, BorderLayout.PAGE_END);

        //EarnPanel
        EarnPanel = new JPanel();
        EarnPanel.setLayout(new BorderLayout());
        EarnPanel.setPreferredSize(new Dimension(300, 180));
        EarnPanel.setBackground(new Color(180, 180, 180));
        EarnPanel.add(Panelx1, BorderLayout.PAGE_START);
        EarnPanel.add(Panelx2, BorderLayout.CENTER);
        EarnPanel.add(back, BorderLayout.PAGE_END);

        //LPanel
        LPanel = new JPanel();
        LPanel.setBackground(new Color(180, 180, 180));
        LPanel.setLayout(new BorderLayout());
        LPanel.add(coinText, BorderLayout.PAGE_START);
        LPanel.add(L3Panel, BorderLayout.CENTER);
        LPanel.add(QPanel, BorderLayout.PAGE_END);      // Dodajemy panele, aby wszystko ładnie wyglądało i było poukladane

        this.add(LPanel);

        stawka.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();  // jeżeli wpisywana nie jest liczba, to ignoruje to polecenie
                }
            }
        });

        odpowiedz.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();  // jeżeli wpisywana nie jest liczba, to ignoruje to polecenie
                }
            }
        });
        ButtonsValues();

    }

    void ButtonsValues()
    {
        coinText.setPreferredSize(new Dimension(100, 50));
        coinText2.setPreferredSize(new Dimension(100, 50));
        stawka.setPreferredSize(new Dimension( 10, 30));
        info1Text.setPreferredSize(new Dimension(100, 20));
        wynik.setPreferredSize(new Dimension(100, 80));
        blackButton.setPreferredSize(new Dimension(80, 30));
        redButton.setPreferredSize(new Dimension(80, 30));
        greenButton.setPreferredSize(new Dimension(80, 30));
        earnCoinsButton.setPreferredSize(new Dimension(120, 20));
        pytanie.setPreferredSize(new Dimension(30, 30));
        odpButton.setBackground(new Color(255, 120, 0));
        back.setBackground(new Color(150, 150, 150));
        blackButton.setBackground(new Color(0,0,0));
        redButton.setBackground(new Color(190, 0,0));
        greenButton.setBackground(new Color(0, 120, 0));
        earnCoinsButton.setBackground(new Color(150, 160, 160));
        blackButton.setForeground(Color.WHITE);
        redButton.setForeground(Color.WHITE);
        greenButton.setForeground(Color.WHITE);
        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        blackButton.addActionListener(this);
        earnCoinsButton.addActionListener(this);
        odpButton.addActionListener(this);
        back.addActionListener(this);       // Wprowadzamy wartosci, rozmiary i kolory komponentow
    }

    public ButtonPanel()
    {
        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        createComponents();
    }



    @Override
    public void actionPerformed(ActionEvent e) {        // Teraz tworzymy Eventy przycisków
        Object source = e.getSource();
        if(source == greenButton)
        {
            Losuj(3);
            stawka.setText("");

        }

        if(source == blackButton)
        {
            Losuj(1);
            stawka.setText("");
        }


        if(source == redButton)
        {
           Losuj(2);
            stawka.setText("");
        }

        if(source == earnCoinsButton)
        {
            LPanel.setVisible(false);
            this.add(EarnPanel);
            EarnPanel.setVisible(true);
            coinText2.setText("Coins : " + coins);
            LosowaniePytania();
        }
        if(source == odpButton)
        {
            OdpowiedzNaPytanie();
            LosowaniePytania();
        }
        if(source == back)
        {
            EarnPanel.setVisible(false);
            LPanel.setVisible(true);
            wynikodp.setText(" ");
        }
    }

    void LosowaniePytania() // Funkcja losujaca pytanie
    {
        Losowanie losPyt = new Losowanie();
        int nrZnaku = losPyt.LosowanieZnaku();
        String znak = " ";
        int liczba1 = losPyt.LosowanieLiczby1();
        int liczba2 = losPyt.LosowanieLiczby2();
        if(nrZnaku == 0)
        {
            znak = "+";
            liczba1 = liczba1 * 5;
            liczba2 = liczba2 * 8;
            prawOdp = liczba1 + liczba2;
        }
        else if(nrZnaku == 1)
        {
            znak = "-";
            if(liczba1 < liczba2)
            {
                liczba1 += 123;
            }
            prawOdp = liczba1 - liczba2;
        }
        else if(nrZnaku == 2)
        {
            znak = "*";
            if(liczba1 > 50)
            {
                liczba1 = liczba1 - 30;
            }
            else if(liczba2 > 50)
            {
                liczba2 = liczba2 - 30;
            }
            prawOdp = liczba1 * liczba2;
        }
        pytanie.setText("Ile wynosi " + liczba1 + " " + znak + " " + liczba2);
    }

    void OdpowiedzNaPytanie()  // Sprawdzamy odpowiedz na pytanie
    {
        if(odpowiedz.getText().length() > 0)
        {
            int odp = Integer.parseInt(odpowiedz.getText());
            if(odp == prawOdp)
            {
                wynikodp.setText("Dobrze !");   // Jesli prawidlowa dostajemy dodatkowe monety
                coins += 50;
                coinText2.setText("Coins : " + coins);
                coinText.setText("Coins : " + coins);
            }
            else
            {
                wynikodp.setText("Źle !");
            }
            odpowiedz.setText("");
        }
        else
        {
            wynikodp.setText("Podaj liczbę !");
        }
    }

    void Losuj(int kolor)       // Funkcja ktora sprawdza jaki kolor zostal wylosowany i czy obstawilismy dobry
    {
        Losowanie los = new Losowanie();
        int wylosowana;
        if(stawka.getText().length() > 0)
        {
            koszt = Integer.parseInt(stawka.getText());
            if(koszt <= coins)
            {
                wylosowana = los.Losowanie(100);
                if(wylosowana < 47)
                {
                    wynik.setText("Czarny !");
                    if(kolor == 1)
                    {
                        coins += koszt;
                        coinText.setText("Coins : " + coins);
                    }
                    else
                    {
                        coins -= koszt;
                        coinText.setText("Coins : " + coins);
                        CheckLose();
                    }
                }
                else if(wylosowana > 52)
                {
                    wynik.setText("Czerwony !");
                    if(kolor == 2)
                    {
                        coins += koszt;
                        coinText.setText("Coins : " + coins);
                    }
                    else
                    {
                        coins -= koszt;
                        coinText.setText("Coins : " + coins);
                        CheckLose();
                    }
                }
                else
                {
                    wynik.setText("Zielony");
                    if(kolor == 3)
                    {
                        coins += koszt * 12;
                        coinText.setText("Coins : " + coins);
                    }
                    else
                    {
                        coins -= koszt;
                        coinText.setText("Coins : " + coins);;
                        CheckLose();
                    }
                }
            }
            else
            {
                wynik.setText("Za mało monet !");
            }
        }
        else
        {
            wynik.setText("Wpisz jakaś liczbę !");
        }
    }

    void CheckLose()        // Ta fukncja sprawdza czy nie brakło nam monet na dalsza grę.
    {
        if(coins <= 0)
        {
            wynik.setText("Przegrałeś !!!");
        }
    }
}
