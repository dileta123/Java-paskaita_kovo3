package com.uzduotis8;

import java.util.Scanner;

/**
 * Created by Svecias on 3/6/2017.
 */
public class Uzduotis8 {
    public Uzduotis8() {
        System.out.print("Iveskite skaiciu");
        Scanner sc = new Scanner(System.in);
        int sk1 = -1;
        int suma = 0;
        while (sk1 != 0) {
            sk1 = sc.nextInt();
            System.out.println(sk1);
            suma += sk1;
        }


        System.out.println(suma);

    }
}
