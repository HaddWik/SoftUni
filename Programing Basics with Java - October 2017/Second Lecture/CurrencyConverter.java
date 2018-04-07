import java.util.Scanner;

/**
 * Author HaddWik on 17/10/2017.
 */
public class CurrencyConverter
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        double amount = Double.parseDouble(console.nextLine());
        String currency = console.nextLine();
        String toBeConverted = console.nextLine();

        if (currency.equalsIgnoreCase("BGN"))
        {
            switch(toBeConverted.toLowerCase())
            {
                case "usd":
                    System.out.printf("%.2f USD", amount / 1.79549);
                    break;
                case "eur":
                    System.out.printf("%.2f EUR", amount / 1.95583);
                    break;
                case "gbp":
                    System.out.printf("%.2f GBP", amount / 2.53405);
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
        else if (currency.equalsIgnoreCase("USD"))
        {
            switch(toBeConverted.toLowerCase())
            {
                case "bgn":
                    System.out.printf("%.2f BGN", amount * 1.79549);
                    break;
                case "eur":
                    System.out.printf("%.2f EUR", (amount * 1.79549) / 1.95583);
                    break;
                case "gbp":
                    System.out.printf("%.2f GBP", (amount * 1.79549) /  2.53405);
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
        else if (currency.equalsIgnoreCase("EUR"))
        {
            switch(toBeConverted.toLowerCase())
            {
                case "bgn":
                    System.out.printf("%.2f BGN", amount * 1.95583);
                    break;
                case "usd":
                    System.out.printf("%.2f USD", (amount * 1.95583) / 1.79549);
                    break;
                case "gbp":
                    System.out.printf("%.2f GBP", (amount * 1.95583) /  2.53405);
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
        else if (currency.equalsIgnoreCase("GBP"))
        {
            switch(toBeConverted.toLowerCase())
            {
                case "bgn":
                    System.out.printf("%.2f BGN", amount * 2.53405);
                    break;
                case "eur":
                    System.out.printf("%.2f EUR", (amount * 2.53405) / 1.95583);
                    break;
                case "usd":
                    System.out.printf("%.2f USD", (amount * 2.53405) /  1.79549);
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }
}
