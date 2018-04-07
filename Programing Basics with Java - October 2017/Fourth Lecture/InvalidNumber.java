import java.util.Scanner;

public class InvalidNumber
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        boolean ok = (num >= 100 && num <= 200) || num == 0;

        if (!ok)
            System.out.println("invalid");

    }
}
