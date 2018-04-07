import java.util.Scanner;

/**
 * Author HaddWik on 22/10/2017.
 */
public class ShivashkiCeh
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int tables = Integer.parseInt(console.nextLine());
        double length = Double.parseDouble(console.nextLine());
        double width = Double.parseDouble(console.nextLine());

        double totalAreaCover = tables * (length + 2 * 0.30) * (width + 2 * 0.30);
        double totalAreaKare = tables * (length / 2) * (length / 2);

        System.out.printf("%.2f USD", (totalAreaCover * 7) + (totalAreaKare * 9));
        System.out.println();
        System.out.printf("%.2f BGN", ((totalAreaCover * 7) + (totalAreaKare * 9)) * 1.85);
    }
}
