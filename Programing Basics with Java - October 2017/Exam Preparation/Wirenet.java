import org.w3c.dom.DOMImplementation;

import java.util.Scanner;

/**
 * Author HaddWik on 18/11/2017.
 */
public class Wirenet
{
    public static void main(String args[])
    {
        Scanner console = new Scanner(System.in);

        int length = Integer.parseInt(console.nextLine());
        int width = Integer.parseInt(console.nextLine());
        double height = Double.parseDouble(console.nextLine());
        double price = Double.parseDouble(console.nextLine());
        double weight = Double.parseDouble(console.nextLine());

        int result1 = (2 * length) + (2 * width); // Dyljina na mrejata
        double result2 = result1 * height; // plosht na mrejata
        System.out.println(result1);
        System.out.printf("%.2f", result1 * price);
        System.out.println();
        System.out.printf("%.3f", result2 * weight);
    }
}
