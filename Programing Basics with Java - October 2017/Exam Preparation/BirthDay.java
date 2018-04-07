import java.util.Scanner;

/**
 * Author HaddWik on 17/10/2017.
 */
public class BirthDay
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int length = Integer.parseInt(console.nextLine());
        int width = Integer.parseInt(console.nextLine());
        int height = Integer.parseInt(console.nextLine());
        double percent = Double.parseDouble(console.nextLine()) * 0.01;

        double totalLiters = (length * width * height) * 0.001;

        System.out.printf("%.3f", totalLiters * (1 - percent));
        //System.out.println(totalLiters);
    }
}
