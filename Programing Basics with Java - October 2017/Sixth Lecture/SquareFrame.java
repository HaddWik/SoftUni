import java.util.Scanner;

/**
 * Author HaddWik on 15/02/2017.
 */
public class SquareFrame
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // Print the top row: + - - - +
        System.out.print("+");
        for (int i = 0; i < n - 2; i++)
            System.out.print(" -");
        System.out.println(" +");

        for (int row = 0; row < n - 2; row++)
        {
            System.out.print("|");
            for (int i = 0; i < n - 2; i++)
                System.out.print(" -");
            System.out.println(" |");
        }

        System.out.print("+");
        for (int i = 0; i < n - 2; i++)
            System.out.print(" -");
        System.out.println(" +");
    }
}
