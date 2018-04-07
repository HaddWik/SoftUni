import java.util.Scanner;

/**
 * Author HaddWik on 23/10/2017.
 */
public class BonusScore
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        double bonusScore = 0.0;

        if (count <= 100)
            bonusScore = 5;
        else if (count > 101 && count < 999)
            bonusScore = count * 0.20;
        else if (count > 1000)
            bonusScore = count * 0.10;

        if (count % 10 == 5) // ends on five
            bonusScore = bonusScore + 2;

        if (count % 2 == 0)
            bonusScore = bonusScore + 1;

        System.out.println(bonusScore);
        System.out.println(count + bonusScore);
    }
}
