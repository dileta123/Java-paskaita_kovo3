package com.uzduotis7;

import java.util.Scanner;


public class Uzduotis7 {
    public Uzduotis7() {
        System.out.print("Iveskite bet koki zodi");
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        while (!x.equals("pabaiga"))
        {
            x = scanner.next();
            System.out.println(x);
        }
        System.out.print("Programa baigta");
    }
}