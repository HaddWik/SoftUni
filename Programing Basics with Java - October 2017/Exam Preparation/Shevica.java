import java.util.Scanner;

/**
 * Author HaddWik on 22/10/2017.
 */
public class Shevica
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String firstLine = repeatStr(".", (n * 3 - 1) / 2) + "x" + repeatStr(".", (n * 3 - 1) / 2);
        System.out.println(firstLine);
        String secondLine = repeatStr(".", (n * 3 - 3) / 2) + "/x\\" + repeatStr(".", (n * 3 - 3) / 2);
        System.out.println(secondLine);
        String tirthLine = repeatStr(".", (n * 3 - 3) / 2) + "x|x" + repeatStr(".", (n * 3 - 3) / 2);
        System.out.println(tirthLine);
        for (int i = 0; i < (n - 1) / 2; i++)
        {
            String cycle = repeatStr(".", (n * 3 - 1) / 2 - n - i) + repeatStr("x", n + i)
                    + "|"
                    + repeatStr("x", n + i)
                    + repeatStr(".", (n * 3 - 1) / 2 - n - i);
            System.out.println(cycle);
        }

        String middle = repeatStr("x", (n*3-1)/2) + "|" + repeatStr("x", (n*3-1)/2);
        System.out.println(middle);
        for (int i = 0; i < (n - 1) / 2 ; i++)
        {
            String cycleReverse = repeatStr(".", 1 + i) + repeatStr("x", (n*3 - 3)/2 - i)
                    + "|"
                    + repeatStr("x", (n*3 - 3)/2 - i)
                    + repeatStr(".", 1 + i);
            System.out.println(cycleReverse);
        }

        System.out.println(secondLine);
        String secondLineMirrored = repeatStr(".", (n * 3 - 3) / 2) + "\\x/" + repeatStr(".", (n * 3 - 3) / 2);
        System.out.println(secondLineMirrored);
        for (int i = 0; i < (n - 1) / 2; i++)
        {
            String cycle = repeatStr(".", (n * 3 - 1) / 2 - n - i) + repeatStr("x", n + i)
                    + "|"
                    + repeatStr("x", n + i)
                    + repeatStr(".", (n * 3 - 1) / 2 - n - i);
            System.out.println(cycle);
        }

        System.out.println(middle);
        for (int i = 0; i < (n - 1) / 2 ; i++)
        {
            String cycleReverse = repeatStr(".", 1 + i) + repeatStr("x", (n*3 - 3)/2 - i)
                    + "|"
                    + repeatStr("x", (n*3 - 3)/2 - i)
                    + repeatStr(".", 1 + i);
            System.out.println(cycleReverse);
        }
        System.out.println(tirthLine);
        System.out.println(secondLineMirrored);
        System.out.println(firstLine);
    }

    static String repeatStr(String strToRepeat, int count)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++)
            sb.append(strToRepeat);

        return sb.toString();
    }
}
