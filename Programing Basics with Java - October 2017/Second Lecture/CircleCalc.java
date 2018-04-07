import java.util.Scanner;

/**
 * Author HaddWik on 20/12/2016.
 */
public class CircleCalc
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        double r = Double.parseDouble(console.nextLine());
        double area = Math.PI * r * r;
        double perimeter = 2 * Math.PI * r;

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
