import java.util.Scanner;

/**
 * Author HaddWik on 15/02/2017.
 */
public class ChristmasTree
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= n; i++)
        {
            String stars = repeatStr("*", i);
            String spaces = repeatStr(" ", n - i);
            System.out.print(spaces);
            System.out.print(stars);
            System.out.print(" | ");
            System.out.print(stars);
            System.out.println(spaces);
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
