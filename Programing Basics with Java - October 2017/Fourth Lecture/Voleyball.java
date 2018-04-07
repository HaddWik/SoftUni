import java.util.Scanner;

public class Voleyball
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        String yearType = scanner.nextLine().toLowerCase();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        double playedDays;
        double weekendsInSofia = 48 - h;

        if (yearType.equalsIgnoreCase("leap"))
        {
            playedDays = ((weekendsInSofia * 3.0 / 4) + h + (p * 2.0 / 3));
            playedDays = (1.15 * playedDays);
            System.out.println((int) playedDays);
        }
        else
        {
            playedDays = ((weekendsInSofia * 3.0 / 4) + h + (p * 2.0 / 3));
            System.out.println((int) playedDays);
        }
    }
}
