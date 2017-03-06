package com.uzduotis4;

import java.util.Scanner;

/**
 * Created by Svecias on 3/6/2017.
 */
public class Uzduotis4 {
    public Uzduotis4() {
        System.out.print("Iveskite savo svori kilogramais");
        Scanner skaneris = new Scanner(System.in);
        double svoris = skaneris.nextDouble();
        System.out.print("Iveskite savo ugi centimetrais");
        double ugis = skaneris.nextDouble();
        skaiciavimas sk = new skaiciavimas();
        double result = sk.KMI(ugis, svoris);
        System.out.print("Jusu KMI yra" + result);
    }


}

class skaiciavimas {

    public double KMI(double ugis, double svoris) {
        double result = svoris / (ugis * ugis);
        return result;
    }
}
