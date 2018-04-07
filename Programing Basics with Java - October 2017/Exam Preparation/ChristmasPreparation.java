import java.util.Scanner;

/**
 * Author HaddWik on 16/12/2017.
 */
public class ChristmasPreparation
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int rollsPaper = Integer.parseInt(console.nextLine());
        int rollsFabric = Integer.parseInt(console.nextLine());
        double littersGlue = Double.parseDouble(console.nextLine());
        int discount = Integer.parseInt(console.nextLine());

        double paperCost = rollsPaper * 5.80;
        double fabricCost = rollsFabric * 7.20;
        double glueCost = littersGlue * 1.20;
        double totalCost = paperCost + fabricCost + glueCost;

        System.out.printf("%.3f", totalCost - ((totalCost * discount) / 100));
    }
}
