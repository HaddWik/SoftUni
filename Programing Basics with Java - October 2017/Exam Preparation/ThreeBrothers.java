import java.util.Scanner;

/**
 * Author HaddWik on 18/10/2017.
 */
public class ThreeBrothers
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        double bro1 = Double.parseDouble(console.nextLine());
        double bro2 = Double.parseDouble(console.nextLine());
        double bro3 = Double.parseDouble(console.nextLine());
        double father = Double.parseDouble(console.nextLine());

        double totalCleaningTime = (1 / (1 / bro1 + 1 / bro2 + 1 / bro3)) * 1.15;

        if (totalCleaningTime <= father)
        {
            System.out.printf("Cleaning time: %.2f", totalCleaningTime);
            System.out.println();
            System.out.println("Yes, there is a surprise - time left -> " + (int)Math.floor(Math.abs(totalCleaningTime - father)) + " hours.");
        }
        else
        {
            System.out.printf("Cleaning time: %.2f", totalCleaningTime);
            System.out.println();
            System.out.println("No, there isn't a surprise - shortage of time -> " + (int)Math.ceil(Math.abs(totalCleaningTime - father)) + " hours.");
        }
    }
}
