import java.util.Scanner;

/**
 * 04. Vowel or Digit
 */
public class Exercise_4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String result = input.nextLine();

        try
        {
            Integer.parseInt(result);

            System.out.println("digit");
        }
        catch(NumberFormatException e)
        {
            if (result.equalsIgnoreCase("a") || result.equalsIgnoreCase("i")
                    || result.equalsIgnoreCase("o") || result.equalsIgnoreCase("u")
                    || result.equalsIgnoreCase("e"))
                System.out.println("vowel");
            else
                System.out.println("other");
        }
    }
}
