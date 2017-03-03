import java.util.Scanner;

public class uzduotis4 {

    public static void main(String[] args) {
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
