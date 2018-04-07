import org.w3c.dom.DOMImplementation;

import java.util.Scanner;

/**
 * Author HaddWik on 20/10/2017.
 */
public class GrandpaStavri
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int days = Integer.parseInt(console.nextLine());
        double liter = 0.0, degrees = 0.0, literTotal = 0.0;

        for (int i = 1; i < days+1; i++)
        {
            liter = Double.parseDouble(console.nextLine());
            degrees += liter * Double.parseDouble(console.nextLine());

            literTotal += liter;
        }

        System.out.printf("Liter: %.2f", literTotal);
        System.out.println();
        System.out.printf("Degrees: %.2f", degrees / literTotal);
        System.out.println();

        if (degrees / literTotal < 38)
            System.out.println("Not good, you should baking!");
        else if (degrees / literTotal > 30 && degrees / literTotal <= 42)
            System.out.println("Super!");
        else
            System.out.println("Dilution with distilled water!");
    }
}
