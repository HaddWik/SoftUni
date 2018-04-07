import java.util.Scanner;

/**
 * Author HaddWik on 23/10/2017.
 */
public class ExcellentOrNot
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        double grade = Double.parseDouble(console.nextLine());

        if(grade >= 5.50)
            System.out.println("Excellent!");
        else
            System.out.println("Not excellent.");
    }
}
