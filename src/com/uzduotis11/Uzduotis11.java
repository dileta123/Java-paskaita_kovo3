package com.uzduotis11;

import java.util.Scanner;

/**
 * Created by Svecias on 3/7/2017.
 */
public class Uzduotis11 {
    public Uzduotis11() {
        System.out.println("Kiek skaiciu ketinate ivesti?");
        Scanner scanner = new Scanner(System.in);
        int[] skaiciai = new int[scanner.nextInt()];
        for (int i = 0; i < skaiciai.length; i++) {
            System.out.println("Iveskite " + (i + 1) + "a skaiciu");
            skaiciai[i] = scanner.nextInt();
        }
        for (int i = 0; i < skaiciai.length; i++) {

            if (skaiciai[i] > 100) {
                System.out.println(skaiciai[i]);
            } else {
                System.out.println(" ");
            }
        }
    }
}
