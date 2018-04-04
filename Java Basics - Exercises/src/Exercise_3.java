import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 03. Reverse Characters
 */
public class Exercise_3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] letters = new String[3];

        for (int i = 0; i < letters.length; i++)
            letters[i] = input.nextLine();

        List<String> lettersAsList = Arrays.asList(letters);
        Collections.reverse(lettersAsList);
        System.out.print(String.join("", lettersAsList));
    }
}
