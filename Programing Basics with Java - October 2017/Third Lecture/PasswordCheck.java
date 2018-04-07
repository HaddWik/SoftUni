import java.util.Scanner;

public class PasswordCheck
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String correct = "s3cr3t!P@ssw0rd";

        if (input.equals(correct))
        {
            System.out.println("Welcome");
        }
        else
        {
            System.out.println("Wrong password!");
        }
    }
}
