import java.util.Scanner;

/**
 * Author HaddWik on 17/10/2017.
 */
public class RadiansToDegrees
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        double rad = Double.parseDouble(console.nextLine());
        double degrees = (rad * 180) / Math.PI;

        System.out.println(degrees);
    }
}
