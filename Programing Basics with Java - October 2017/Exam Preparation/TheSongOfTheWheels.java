import java.util.Scanner;

/**
 * Author HaddWik on 22/10/2017.
 */
public class TheSongOfTheWheels
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int m = Integer.parseInt(console.nextLine());
        int ctr = 0;
        String password = null;

        for (int i = 1; i <= 9; i++)
            for (int j = 1; j <= 9; j++)
                for (int k = 1; k <= 9; k++)
                    for (int l = 1; l < 9; l++)
                        if (i < j && k > l)
                        {
                            int calculation = i * j + k * l;
                            if (calculation == m)
                            {
                                System.out.print(""+i+""+j+""+k+""+l+" ");
                                ctr++;
                                if (ctr == 4)
                                    password = ""+i+""+j+""+k+""+l;
                            }
                        }
        if (ctr > 0)
            System.out.println();
        if (password != null)
            System.out.println("Password: " + password);
        else
            System.out.println("No!");
    }
}
