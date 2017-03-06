package com.pamokos;

import com.uzduotis1.Uzduotis1;
import com.uzduotis2.Uzduotis2;
import com.uzduotis3.Uzduotis3;
import com.uzduotis4.Uzduotis4;
import com.uzduotis5.Uzduotis5;
import com.uzduotis6.Uzduotis6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Uzduotis1 uzduotis1 = new Uzduotis1();

        System.out.print("Iveskite skaiciu nuo 1 iki 4");
        Scanner scanner = new Scanner(System.in);
        int sk1 = scanner.nextInt();
        if (sk1 == 1)
        {
            Uzduotis2 uzduotis2 = new Uzduotis2();
        }
        if (sk1 == 2)
        {
            Uzduotis4 uzduotis4 = new Uzduotis4();
        }
        if (sk1 == 3)
        {
            Uzduotis3 uzduotis3 = new Uzduotis3();
        }
        if (sk1 == 4)
    {
        Uzduotis5 uzduotis5 = new Uzduotis5();
    }
        Uzduotis6 uzduotis6 = new Uzduotis6();
    }

}

