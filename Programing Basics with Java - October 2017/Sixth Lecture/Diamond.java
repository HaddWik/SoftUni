import java.util.Scanner;

/**
 * Author HaddWik on 15/02/2017.
 */
public class Diamond
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int leftRight = (n - 1) / 2;
        for (int i = 1; i <= (n-1) / 2; i++) {
            // Draw the top part
            System.out.print(repeatStr("-", leftRight));
            System.out.print("*");
            int mid = n - 2 * leftRight - 2;
            if (mid >= 0) {
                System.out.print(repeatStr("-", mid));
                System.out.print("*");
            }
            System.out.println(repeatStr("-", leftRight));
            leftRight--;
        } // TODO: Draw the bottom part

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
