import java.util.Scanner;

/**
 * 15. Censor Email Address
 */
public class Exercise_15
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        String text = input.nextLine();
        String censoredEmail = censorMail(email);
        String censoredText = text.replace(email, censoredEmail);

        System.out.println(censoredText);
    }

    private static String censorMail(String text)
    {
        StringBuilder sb = new StringBuilder(text.length());
        int index = text.indexOf('@');

        for (int i = 0; i < index; i++)
            sb.append('*');

        sb.append(text.substring(index));

        return sb.toString();
    }
}