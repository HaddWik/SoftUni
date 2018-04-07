import java.util.Scanner;

/**
 * Author HaddWik on 16/12/2017.
 */
public class ChristmasToy
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        String firstLine = repeatStr("-", (n * 4) / 2) + repeatStr("x", n) + repeatStr("-", (n * 4) / 2);
        System.out.println(firstLine);
        String secondLine = repeatStr(".", (n * 3 - 3) / 2) + "/x\\" + repeatStr(".", (n * 3 - 3) / 2);
        System.out.println(secondLine);
    }

    public static String repeatStr(String strToRepeat, int count)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++)
            sb.append(strToRepeat);

        return sb.toString();
    }
}
