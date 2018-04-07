import java.util.Scanner;

/**
 * Author HaddWik on 04/11/2017.
 */
public class PhotoPictures
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int pictures = Integer.parseInt(console.nextLine());
        String type = console.nextLine();
        String orderType = console.nextLine();

        double price = 0.0;

        switch (type.toLowerCase())
        {
            case "9x13":
            {
                if (pictures >= 50)
                    price = (pictures * 0.16) * 0.95;
                else
                    price = pictures * 0.16;
                break;
            }
            case "10x15":
            {
                if (pictures >= 80)
                    price = (pictures * 0.16) * 0.97;
                else
                    price = pictures * 0.16;
                break;
            }
            case "13x18":
            {
                if (pictures >= 50 && pictures <= 100)
                    price = (pictures * 0.38) * 0.97;
                else if (pictures > 100)
                    price = (pictures * 0.38) * 0.95;
                else
                    price = pictures * 0.38;
                break;
            }
            case "20x30":
            {
                if (pictures >= 10 && pictures <= 50)
                    price = (pictures * 2.90) * 0.93;
                else if (pictures > 50)
                    price = (pictures * 2.90) * 0.91;
                else
                    price = pictures * 2.90;
                break;
            }
        }

        if (orderType.equalsIgnoreCase("online"))
            System.out.printf("%.2fBGN", price * 0.98);
        else
            System.out.printf("%.2fBGN", price);
    }
}
