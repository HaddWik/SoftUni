import java.util.Scanner;

/**
 * Author HaddWik on 18/11/2017.
 */
public class Lutenica
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        double amount = Double.parseDouble(console.nextLine());
        int cases = Integer.parseInt(console.nextLine());
        int jars = Integer.parseInt(console.nextLine());

        double totalLutenica = amount / 5;
        double totalJars = totalLutenica / 0.535;
        double totalCases = totalJars / jars;

        System.out.println("Total lutenica: " + (int) totalLutenica + " kilograms.");

        if (totalCases > cases)
        {
            System.out.println((int) totalCases - cases + " boxes left.");
            System.out.println((int) totalJars - (cases*jars) + " jars left.");
        }
        else
        {
            Double result1 = cases - totalCases;
            Double result2 = cases*jars - totalJars;
            System.out.println(result1.intValue() + " more boxes needed.");
            System.out.println(result2.intValue() + " more jars needed.");
        }
    }
}
