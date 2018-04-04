import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 11. Equal Sums
 */
public class Exercise_11
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] sequence = Arrays.stream(input.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        ArrayList<Integer> equalSumsIndices = new ArrayList<>();
        Long sum = 0L;

        for (int number : sequence)
            sum += number;

        Long sumRight = sum;
        Long sumLeft = 0L;
        boolean isEqualSum = false;

        for (int i = 0; i < sequence.length; i++)
        {
            sumRight -= sequence[i];

            if (sumLeft == sumRight)
            {
                equalSumsIndices.add(i);
                isEqualSum = true;
            }
            sumLeft += sequence[i];
        }

        if (isEqualSum)
        {
            for (int index : equalSumsIndices)
                System.out.println(index);
        }
        else
            System.out.println("no");
    }
}