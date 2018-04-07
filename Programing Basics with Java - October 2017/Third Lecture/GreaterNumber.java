import java.util.Scanner;

/**
 * Author HaddWik on 23/10/2017.
 */
public class GreaterNumber
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int num1 = Integer.parseInt(console.nextLine());
        int num2 = Integer.parseInt(console.nextLine());

        if (num1 > num2)
            System.out.println(num1);
        else
            System.out.println(num2);
    }
}
