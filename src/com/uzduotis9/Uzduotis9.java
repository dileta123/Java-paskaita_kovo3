package com.uzduotis9;

import java.util.Scanner;

public class Uzduotis9 {
    public Uzduotis9(int ilgis) {

        System.out.println("Iveskite " + ilgis + " sveikus skaicius");
        Scanner sc = new Scanner(System.in);
        int[] masyvas = new int[ilgis];
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println("Iveskite " + (i + 1) + "a skaiciu");
            masyvas[i] = sc.nextInt();
        }
        int suma = 0;
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println("Ivestas skaicius" + masyvas[i]);
            suma += masyvas[i];
        }
        System.out.println("Ivestu skaiciu suma" + suma);
    }
}
