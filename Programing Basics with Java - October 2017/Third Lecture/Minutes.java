import java.util.Scanner;

/**
 * Author HaddWik on 16/01/2017.
 */
public class Minutes
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int h = Integer.parseInt(console.nextLine());
        int m = Integer.parseInt(console.nextLine());

        if ((m + 15) > 59)
        {
            if ((h + 1) > 23)
            {
                if ((m + 15 - 60) < 10)
                {
                    System.out.println("0:0" + (m + 15 - 60));
                }
                else
                {
                    System.out.println("0:" + (m + 15 - 60));
                }
            }
            else
            {
                if ((m + 15 - 60) < 10)
                {
                    System.out.println((h + 1) + ":0" + (m + 15 - 60));
                }
                else
                {
                    System.out.println((h + 1) + ":" + (m + 15 - 60));
                }
            }
        }
        else
        {
            System.out.println(h + ":" + (m + 15));
        }
    }
}
