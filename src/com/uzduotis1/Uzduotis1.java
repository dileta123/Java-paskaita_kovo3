package com.uzduotis1;

import java.util.Scanner;

/**
 * Created by Svecias on 3/6/2017.
 */
public class Uzduotis1 {
    public Uzduotis1() {
        System.out.print("Iveskite varda");
        Scanner skaneris = new Scanner(System.in);
        String vardas = skaneris.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.println(vardas);
        }
    }
}
