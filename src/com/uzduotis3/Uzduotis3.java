package com.uzduotis3;

import java.util.Scanner;

/**
 * Created by Svecias on 3/6/2017.
 */
public class Uzduotis3 {
    public Uzduotis3() {
        System.out.print("Iveskite savo svori kilogramais");
        Scanner skaneris = new Scanner(System.in);
        double svoris = skaneris.nextInt();
        System.out.print("Iveskite savo ugi centimetrais");
        double ugis = skaneris.nextInt();
        Math.pow(ugis, 2);
        double KMI = svoris / ugis;
        System.out.print("Jusu KMI yra" + KMI);
    }
}
