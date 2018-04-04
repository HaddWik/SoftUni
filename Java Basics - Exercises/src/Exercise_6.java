import java.util.Scanner;

/**
 * 06. Compare Char Arrays
 */
public class Exercise_6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] firstArr = input.nextLine().split("\\s");
        String[] secondArr = input.nextLine().split("\\s");

        if (firstArr.length > secondArr.length)
        {
            String[] arrayTemp = firstArr;

            firstArr = secondArr;
            secondArr = arrayTemp;
        }
        else if (secondArr.length == firstArr.length)
        {
            for (int i = 0; i < firstArr.length; i++)
            {
                if (firstArr[i].charAt(0) > secondArr[i].charAt(0))
                {
                    String[] arrayTemp = firstArr;

                    firstArr = secondArr;
                    secondArr = arrayTemp;
                    break;
                }
            }
        }

        printArray(firstArr);
        printArray(secondArr);
    }

    public static void printArray(String[] array)
    {
        for (String element : array)
            System.out.print(element);

        System.out.println();
    }
}
