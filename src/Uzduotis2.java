import java.util.Scanner;

public class Uzduotis2 {
    public static void main(String[] args) {
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
