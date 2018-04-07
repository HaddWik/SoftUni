import java.util.Scanner;

public class OddEvenSum
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int oddSum = 0;
        int evenSum = 0;

        for(int i = 1; i <= n; i++)
        {
            int num = Integer.parseInt(scanner.nextLine());

            if(i % 2 == 0)
                oddSum += num;
            else
                evenSum += num;
        }

        if (oddSum == evenSum)
            System.out.println("Yes, sum = " + oddSum);
        else
            System.out.println("No, diff = " + Math.abs(oddSum - evenSum));
    }
}
