package com.uzduotis6;

import java.util.Scanner;

/**
 * Created by Svecias on 3/6/2017.
 */
public class Uzduotis6 {
    public Uzduotis6() {
        System.out.print("Iveskite skaiciu nuo 1 iki 100");
        Scanner scanner = new Scanner(System.in);
        int sk1 = scanner.nextInt();

        if (sk1 % 2 == 0) {
            System.out.print("Skaicius" + sk1 + "yra lyginis");
        } else {
            System.out.print("Skaicius" + sk1 + "yra nelyginis");
        }
    }
}
