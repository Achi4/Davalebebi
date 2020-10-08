package com.company;
import java.util.Scanner;


public class C {
    private int a, b, c;

    public void Shetana() {
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
    }

    public int Bolo()
    {
        return a % 10;
    }

    public int Pirveli()
    {
        return  Integer.parseInt(Integer.toString(b).substring(0, 1));
    }

    public int Jami()
    {
        int jami = String.valueOf(c)
                .chars()
                .map(Character::getNumericValue)
                .sum();

        return jami;
    }

    public int Gamravleba()
    {
        return Bolo() * (Pirveli());
    }

    public int Metodi6()
    {
        return (Pirveli()) + Gamravleba();
    }
}