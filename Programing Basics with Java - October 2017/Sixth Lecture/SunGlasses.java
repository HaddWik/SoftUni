import java.util.Scanner;

/**
 * Author HaddWik on 15/02/2017.
 */
public class SunGlasses
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int right = n / 2;
        int left = n / 2;
        if (n % 2 == 0)
        {
            left--;
        }
        for (int row = 0; row < n / 2 ; row++)
        {
            for (int col = 0; col < n; col++)
            {
                if (col == left || col == right)
                {
                    System.out.print('*');

                }
                else
                {
                    System.out.print('-');
                }

            }
            left--;
            right++;
            System.out.println();
        }
        if (n % 2 == 1)
        {
            System.out.print('*');
            System.out.print(repeatStr("-", n - 2));
            System.out.print('*');
            System.out.println();
        }
        left = 1;
        right = n - 2;

        for (int row = 0; row < n / 2 - 1; row++)
        {
            for (int col = 0; col < n; col++)
            {
                if (col == left || col == right)
                {
                    System.out.print('*');

                }
                else
                {
                    System.out.print('-');

                }

            }
            left++;
            right--;
            System.out.println();
        }
        if (n % 2 == 1)
        {
            System.out.print(repeatStr("-", n - 1 / 2));
            System.out.print('*');
            System.out.print(repeatStr("-", n - 1 / 2));
            System.out.println();
        }
    }

    private static String repeatStr(String strToRepeat, int count)
    {
        String text = "";

        for (int i = 0; i < count; i++)
        {
            text = text + strToRepeat;
        }

        return text;
    }
}
