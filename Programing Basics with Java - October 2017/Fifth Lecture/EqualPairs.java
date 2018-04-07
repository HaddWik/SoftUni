import java.util.Scanner;

public class EqualPairs
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int currSum = 0;
        int prevSum = 0;
        int diff;
        int maxDiff = 0;

        for (int i = 0; i < n; i++)
        {
            prevSum = currSum;
            currSum = 0;
            currSum += Integer.parseInt(scanner.nextLine());
            currSum += Integer.parseInt(scanner.nextLine());

            if (i != 0)
            {
                diff = Math.abs(currSum - prevSum);
                if (diff != 0 && diff > maxDiff)
                    maxDiff = diff;
            }

        }

        if (prevSum == currSum || n == 1)
            System.out.println("Yes, value=" + currSum);
        else
            System.out.println("No, maxdiff=" + maxDiff);
    }
}
