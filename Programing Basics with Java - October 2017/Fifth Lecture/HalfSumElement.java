import java.util.Scanner;

public class HalfSumElement
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int max = 0;

        for (int i = 1; i <= n; i++)
        {
            int num = Integer.parseInt(scanner.nextLine());

            sum += num;

            if (i == 0)
                max = num;
            else if (max < num)
                max = num;
        }

        int diff = sum - max;
        if (diff == max)
            System.out.println("Yes, Sum = " + max);
        else
            System.out.println("No, Diff = " + Math.abs(sum - 2 * max));
    }
}
