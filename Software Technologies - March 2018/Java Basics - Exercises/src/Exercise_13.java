import java.util.Scanner;

/**
 * 13. Reverse String
 */
public class Exercise_13
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        char[] inputAsArr = input.nextLine().toCharArray();

        for (int i = inputAsArr.length - 1; i >= 0; i--)
            System.out.print(inputAsArr[i]);
    }
}