import java.util.Scanner;

/**
 * 2. Boolean Variable
 */
public class Exercise_2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        if (input.nextLine().equalsIgnoreCase("true"))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
