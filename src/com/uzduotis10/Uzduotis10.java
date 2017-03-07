package com.uzduotis10;

import java.util.Scanner;


public class Uzduotis10 {
    public Uzduotis10(){
        System.out.println("Iveskite 5 zodzius");
        Scanner scanner = new Scanner(System.in);
        String[] x = new String[5];
        for (int i = 0; i <= 5; i++)
        {
            x[i] = scanner.nextLine();
            System.out.println("Jus ivedete zodi "+x[i]);
        }
    }
}
