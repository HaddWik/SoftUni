import java.util.Scanner;

/**
 * 17. Change to Uppercase
 */
public class Exercise_17
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        while (text.contains("<upcase>"))
        {
            int indexStart = text.indexOf("<upcase>");
            int indexEnd = text.indexOf("</upcase>") + "</upcase>".length();
            String textToReplace = text.substring(indexStart, indexEnd);
            String textToUpper = textToReplace.substring("<upcase>".length(), textToReplace.length() - "</upcase>".length()).toUpperCase();

            text = text.replace(textToReplace, textToUpper);
        }
        System.out.println(text);
    }
}