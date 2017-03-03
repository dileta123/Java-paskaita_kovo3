import java.util.Scanner;

/**
 * Created by Svecias on 3/3/2017.
 */
public class uzduotis1 {
    public static void main (String[] args)
    {
      System.out.print("Iveskite varda");
      Scanner skaneris = new Scanner(System.in);
      String vardas = skaneris.nextLine();
      for (int i = 0; i < 5; i++)
      {
        System.out.println(vardas);
      }
    }
}
