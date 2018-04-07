import java.util.Scanner;

/**
 * Author HaddWik on 20/12/2016.
 */
public class TwoDRectangle
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        double x1 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());
        double x2 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());
        double width = Math.max(x1, x2) - Math.min(x1, x2);
        double height = Math.max(y1, y2) - Math.min(y1, y2);

        System.out.printf("area = %f%n", width * height);
        System.out.printf("perimeter = %f%n", 2 * (width + height));
    }
}
