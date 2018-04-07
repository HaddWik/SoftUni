import java.util.Scanner;

/**
 * Author HaddWik on 23/10/2017.
 */
public class EvenOrOdd
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int num = Integer.parseInt(console.nextLine());
        boolean even = (num % 2 == 0);

        if(even)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}
