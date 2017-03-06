package com.uzduotis2;

import java.util.Scanner;

/**
 * Created by Svecias on 3/6/2017.
 */
public class Uzduotis2 {
    public Uzduotis2() {
        System.out.print("Iveskite 2 skaicius");
        Scanner scanner = new Scanner(System.in);
        int sk1 = scanner.nextInt();
        int sk2 = scanner.nextInt();
        int skirtumas = sk1 - sk2;
        int suma = sk1 + sk2;
        System.out.print("skirtumas yra" + skirtumas);
        System.out.print("suma yra" + suma);
    }
}
