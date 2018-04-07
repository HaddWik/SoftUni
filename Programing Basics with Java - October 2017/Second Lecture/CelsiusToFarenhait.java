import java.util.Scanner;

/**
 * Author HaddWik on 16/10/2017.
 */
public class CelsiusToFarenhait
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        double input = Double.parseDouble(console.nextLine());
        double result = input * 1.8 + 32;

        System.out.printf("%.2f", result);
    }
}
