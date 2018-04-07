import java.util.Scanner;

/**
 * Author HaddWik
 */
public class InToCm
{
    public static void main (String[] args)
    {
        Scanner console = new Scanner(System.in);

        System.out.println("Inches =  ");
        double in = Double.parseDouble(console.nextLine());
        double cm = in * 2.54;
        System.out.println("centimeters = " + cm);
    }
}
