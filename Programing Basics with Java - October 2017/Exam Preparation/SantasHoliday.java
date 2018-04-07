import java.util.Scanner;

/**
 * Author HaddWik on 16/12/2017.
 */
public class SantasHoliday
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int days = Integer.parseInt(console.nextLine()) - 1;
        String type = console.nextLine();
        String evaluation = console.nextLine();

        // Pricing
        double cost = 0.0;
        switch(type.toLowerCase())
        {
            case "room for one person":
                cost = 18.00;
                break;
            case "apartment":
                cost = 25.00;
                break;
            case "president apartment":
                cost = 35.00;
                break;
        }

        // Total cost
        double totalCost = days * cost;

        // Discounts for stay
        double totalCostWithDiscount = 0.0;
        if(days < 10)
        {
            switch(type.toLowerCase())
            {
                case "room for one person":
                    totalCostWithDiscount = totalCost; // No discount
                    break;
                case "apartment":
                    totalCostWithDiscount = totalCost - (totalCost * 30 / 100);
                    break;
                case "president apartment":
                    totalCostWithDiscount = totalCost - (totalCost * 10 / 100);
                    break;
            }
        }
        else if (days >= 10 && days <= 15)
        {
            switch(type.toLowerCase())
            {
                case "room for one person":
                    totalCostWithDiscount = totalCost; // No discount
                    break;
                case "apartment":
                    totalCostWithDiscount = totalCost - (totalCost * 35 / 100);
                    break;
                case "president apartment":
                    totalCostWithDiscount = totalCost - (totalCost * 15 / 100);
                    break;
            }
        }
        else
        {
            switch(type.toLowerCase())
            {
                case "room for one person":
                    totalCostWithDiscount = totalCost; // No discount
                    break;
                case "apartment":
                    totalCostWithDiscount = totalCost - (totalCost * 50 / 100);
                    break;
                case "president apartment":
                    totalCostWithDiscount = totalCost - (totalCost * 20 / 100);
                    break;
            }
        }

        // Cost with evaluation
        if(evaluation.equalsIgnoreCase("positive"))
            System.out.printf("%.2f", totalCostWithDiscount + (totalCostWithDiscount * 25 / 100));
        else
            System.out.printf("%.2f", totalCostWithDiscount - (totalCostWithDiscount * 10 / 100));
    }
}
