import java.util.Scanner;

/**
 * Author HaddWik on 16/12/2017.
 */
public class DwarfPresents
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int dwarfsCount = Integer.parseInt(console.nextLine());
        int money = Integer.parseInt(console.nextLine());

        double totalCost = 0.0;

        int i = 0;
        do
        {
            String presentType = console.nextLine();

            totalCost += getCost(presentType);
            i++;
        }
        while(i < dwarfsCount);

        if(totalCost < money)
            System.out.printf("Santa Claus has %.2f more leva left!", money - totalCost);
        else
            System.out.printf("Santa Claus will need %.2f more leva.", totalCost - money);
    }

    public static double getCost(String typeOfPresent)
    {
        if(typeOfPresent.contains("clock"))
            return 2.20;
        else if(typeOfPresent.contains("magnet"))
            return 1.50;
        else if(typeOfPresent.contains("cup"))
            return 5.00;
        else if(typeOfPresent.contains("t-shirt"))
            return 10.00;

        return 0;
    }
}
