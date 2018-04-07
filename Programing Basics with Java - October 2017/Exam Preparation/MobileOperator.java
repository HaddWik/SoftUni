import java.util.Scanner;

/**
 * Author HaddWik on 19/10/2017.
 */
public class MobileOperator
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        String year = console.nextLine();
        String type = console.nextLine();
        String internet = console.nextLine();
        int months = Integer.parseInt(console.nextLine());
        double price = 0.0;
        double totalPrice = 0.0;

        if(year.equalsIgnoreCase("one"))
        {
            switch(type.toLowerCase())
            {
                case "small":
                    price = 9.98;
                    break;
                case "middle":
                    price = 18.99;
                    break;
                case "large":
                    price = 25.98;
                    break;
                case "extralarge":
                    price = 35.99;
                    break;
            }
        }
        else if(year.equalsIgnoreCase("two"))
        {
            switch(type.toLowerCase())
            {
                case "small":
                    price = 8.58;
                    break;
                case "middle":
                    price = 17.09;
                    break;
                case "large":
                    price = 23.59;
                    break;
                case "extralarge":
                    price = 31.79;
                    break;
            }
        }

        if (internet.equalsIgnoreCase("yes"))
        {
            if(price > 30.00)
                totalPrice = price + 3.85;
            else if(price <= 30.00 && price >= 10.00)
                totalPrice = price + 4.35;
            else if(price <= 10.00)
                totalPrice = price + 5.50;
        }
        else
            totalPrice = price;

        if(year.equalsIgnoreCase("two"))
            System.out.printf("%.2f lv.", (96.25*totalPrice)/100 * months);
        else
            System.out.printf("%.2f lv.", totalPrice * months);
    }
}
