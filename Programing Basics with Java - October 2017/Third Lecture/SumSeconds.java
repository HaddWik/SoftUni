import java.util.Scanner;

public class SumSeconds
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int totalSeconds = num1 + num2 + num3;

        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        if (seconds < 10)
            System.out.println(minutes + ":0" + seconds);
        else
            System.out.println(minutes + ":" + seconds);
    }
}
