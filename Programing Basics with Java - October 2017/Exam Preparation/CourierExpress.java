import java.util.Scanner;

/**
 * Author HaddWik on 18/11/2017.
 */
public class CourierExpress
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        double weight = Double.parseDouble(console.nextLine());
        String type = console.nextLine();
        int distance = Integer.parseInt(console.nextLine());

        double cost = 0.0;
        double extraCost = 0.0;
        double result;

        if (weight < 1)
            cost = distance * 0.03;
        else if (weight >= 1 && weight <= 10)
            cost = distance * 0.05;
        else if (weight >= 11 && weight <= 40)
            cost = distance * 0.10;
        else if (weight >= 41 && weight <= 90)
            cost = distance * 0.15;
        else if (weight >= 91)
            cost = distance * 0.20;

        if (type.equalsIgnoreCase("express"))
        {
            if (weight < 1)
                extraCost = 0.03 * (80.0f/100.0f);
            else if (weight >= 1 && weight <= 10)
                extraCost = 0.05 * (40.0f/100.0f);
            else if (weight >= 11 && weight <= 40)
                extraCost = 0.10 * (5.0f/100.0f);
            else if (weight >= 41 && weight <= 90)
                extraCost = 0.15 * (2.0f/100.0f);
            else if (weight >= 91)
                extraCost = 0.20 * (1.0f/100.0f);

            result = (distance * (weight * extraCost)) + cost;
        }
        else
            result = cost;

        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", weight, result);
    }
}
