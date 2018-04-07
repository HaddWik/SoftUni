import java.util.Scanner;

public class PointOfFigure
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int h = Integer.parseInt(scanner.nextLine());
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        int x1 = 0;      // first rectangle
        int y1 = 0;      // first rectangle
        int x2 = 3 * h;  // first rectangle
        int y2 = h;      // first rectangle
        int x3 = h;      // second rectangle
        int y3 = h;      // second rectangle
        int x4 = 2 * h;  // second rectangle
        int y4 = 4 * h;  // second rectangle

        if (((((x == x1) || (x == 3 * h)) && (y1 <= y) && (y <= h)) || (((y == y1) || (y == h)) && (x1 <= x) && (x <= 3 * h))
                || (((x == h) || (x == 2 * h)) && (h <= y) && (y <= 4 * h))
                || (((y == h) || (y == 4 * h)) && (h <= x) && (x <= 2 * h))) && (!((y == h) && (x > h) && (x < 2 * h))))
            System.out.println("border");
        else if (((x >= x1) && (x <= 3 * h) && (y >= y1) && (y <= h)) || ((x >= h) && (x <= 2 * h) && (y >= h) && (y <= 4 * h))
                || (y == h) && (x > h) && (x < 2 * h))
            System.out.println("inside");
        else
            System.out.println("outside");
    }
}
