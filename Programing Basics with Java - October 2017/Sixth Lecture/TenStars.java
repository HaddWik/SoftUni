import java.util.Scanner;

/**
 * Author HaddWik on 15/02/2017.
 */
public class TenStars
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println(repeatStr("*", 10));
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
