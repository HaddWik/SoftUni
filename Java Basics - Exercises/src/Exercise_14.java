import java.util.Scanner;

/**
 * 14. Fit String in 20 Chars
 */
public class Exercise_14
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        if (text.length() > 20)
            text = text.substring(0, 20);
        else if (text.length() < 20)
            text = createString(text, 20);

        System.out.println(text);
    }

    private static String createString(String text, int lenght)
    {
        StringBuilder sb = new StringBuilder(20);
        sb.append(text);

        for (int i = 0; i < lenght - text.length(); i++)
            sb.append('*');

        return sb.toString();
    }
}