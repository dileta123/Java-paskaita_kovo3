import java.util.Scanner;

public class uzduotis3
{
    public static void main(String[] args) {
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
