import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 12. Bomb Numbers
 */
public class Exercise_12
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Long sum = 0L;
        int[] sequence = Arrays.stream(input.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        int[] bombParams = Arrays.stream(input.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();

        int bombElement = bombParams[0];
        int bombStrength = bombParams[1];
        ArrayList<Integer> remainingSeq = new ArrayList<>();

        for (int i = 0; i < sequence.length; i++)
            remainingSeq.add(sequence[i]);

        while (remainingSeq.indexOf(bombElement) != -1)
        {
            int bombIndex = remainingSeq.indexOf(bombElement);
            int bombRangeStart = Math.max(0, bombIndex - bombStrength);
            int bombRangeEnd = Math.min(bombIndex + bombStrength, remainingSeq.size() - 1);

            for (int j = bombRangeStart; j <= bombRangeEnd; j++)
                remainingSeq.remove(bombRangeStart);
        }

        for (int number: remainingSeq)
            sum += number;

        System.out.println(sum);
    }
}