package com.company;

import java.util.Scanner;

public class A {
    int x;

    public A()
    {
        System.out.println("Hello");
    }

    public void Shetana()
    {
        Scanner scanner = new Scanner(System.in);
        this.x = scanner.nextInt();
    }

    public int Mimateba()
    {
        return x + 12;
    }

    public String KentiLuwi()
    {
        if (x%2 == 0)
            return "Luwi";
        else
            return "Kenti";
    }
}
