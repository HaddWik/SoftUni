import java.util.Scanner;

/**
 * Author HaddWik on 16/12/2017.
 */
public class DeerOfSanta
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int daysOff = Integer.parseInt(console.nextLine());
        int foodLeft = Integer.parseInt(console.nextLine());
        double foodDeer1 = Double.parseDouble(console.nextLine());
        double foodDeer2 = Double.parseDouble(console.nextLine());
        double foodDeer3 = Double.parseDouble(console.nextLine());

        double totalFood = (daysOff * foodDeer1) + (daysOff * foodDeer2) + (daysOff * foodDeer3);

        if(totalFood < foodLeft)
            System.out.println(((int)Math.floor(Math.abs(foodLeft-totalFood))) + " kilos of food left.");
        else
            System.out.println(((int)Math.ceil(Math.abs(totalFood-foodLeft))) + " more kilos of food are needed.");
    }
}
