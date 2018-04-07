import java.util.Scanner;

public class Cinema
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine().toLowerCase();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        switch (type.toLowerCase())
        {
            case "premiere": System.out.printf("%.2f", (rows * columns) * 12.00); break;
            case "normal": System.out.printf("%.2f", (rows * columns) * 7.50); break;
            case "discount": System.out.printf("%.2f", (rows * columns) * 5.00); break;
            default: System.out.println("error"); break;
        }
    }
}
