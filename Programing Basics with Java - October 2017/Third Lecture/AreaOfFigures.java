import java.util.Scanner;

/**
 * Author HaddWik on 16/01/2017.
 */
public class AreaOfFigures
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        String type = console.nextLine();

        if (type.equalsIgnoreCase("square"))
        {
            double a = Double.parseDouble(console.nextLine());
            System.out.printf("%.3f", a * a);
        }
        else if (type.equalsIgnoreCase("rectangle"))
        {
            double a = Double.parseDouble(console.nextLine());
            double b = Double.parseDouble(console.nextLine());
            System.out.printf("%.3f", a * b);
        }
        else if (type.equalsIgnoreCase("circle"))
        {
            double r = Double.parseDouble(console.nextLine());
            System.out.printf("%.3f", Math.PI * r * r);
        }
        else if (type.equalsIgnoreCase("triangle"))
        {
            double a = Double.parseDouble(console.nextLine());
            double h = Double.parseDouble(console.nextLine());
            System.out.printf("%.3f", a * h / 2);
        }
    }
}
