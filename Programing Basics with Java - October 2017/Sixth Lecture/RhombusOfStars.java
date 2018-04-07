import java.util.Scanner;

/**
 * Author HaddWik on 15/02/2017.
 */
public class RhombusOfStars
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row < n; row++)
        {
            for (int col = 0; col < n - row; col++)
                System.out.print(" ");

            System.out.print("*");
            for (int col = 1; col < row; col++)
                System.out.print(" *");

            System.out.println();
        }

        System.out.println();

        for (int row = 0; row < n; row++)
        {
            for (int col = 0; col < n - row; col++)
                System.out.print(" *");

            System.out.print("*");
            for (int col = 1; col < row; col++)
                System.out.print(" ");

            System.out.println();
        }
    }
}