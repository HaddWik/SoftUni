import java.text.DecimalFormat;
import java.util.Scanner;

public class OddEvenPosition
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        int n = Integer.parseInt(scanner.nextLine());
        double oddSum = 0.0;
        double evenSum = 0.0;
        double oddMin = 1000000.0;
        double oddMax = -1000000.0;
        double evenMin = 1000000.0;
        double evenMax = -1000000.0;

        for (int i = 1; i <= n; i++)
        {
            double currentNumber = Double.parseDouble(scanner.nextLine());
            boolean isEven = i % 2 == 0;

            if (isEven)
            {
                evenSum += currentNumber;
                if (currentNumber > evenMax)
                    evenMax = currentNumber;

                if (currentNumber < evenMin)
                    evenMin = currentNumber;
            }
            else
            {
                oddSum += currentNumber;
                if (currentNumber > oddMax)
                    oddMax = currentNumber;

                if (currentNumber < oddMin)
                    oddMin = currentNumber;
            }
        }

        if (n == 0)
        {
            System.out.println("OddSum=" + df.format(oddSum));
            System.out.println("OddMin=No");
            System.out.println("OddMax=No");
            System.out.println("EvenSum=" + df.format(evenSum));
            System.out.println("EvenMin=No");
            System.out.println("EvenMax=No");
        }
        else
        {
            System.out.printf("OddSum=" + df.format(oddSum));
            if (oddMin == 1000000.0)
                System.out.println("OddMin=No");
            else
                System.out.printf("OddMin=" + df.format(oddMin));

            if (oddMax == -1000000.0)
                System.out.println("OddMax=No");
            else
                System.out.printf("OddMax=" + df.format(oddMax));

            System.out.printf("EvenSum=" + df.format(evenSum));

            if (evenMin == 1000000.0 && n < 2)
                System.out.println("EvenMin=No");
            else
                System.out.printf("EvenMin=" + df.format(evenMin));

            if (evenMax == -1000000.0 && n < 2)
                System.out.println("EvenMax=No");
            else
                System.out.printf("EvenMax=" + df.format(evenMax));
        }
    }
}
