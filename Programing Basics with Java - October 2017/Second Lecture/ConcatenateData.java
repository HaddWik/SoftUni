import java.util.Scanner;

/**
 * Author HaddWik
 */
public class ConcatenateData
{
    public static void main (String[] args)
    {
        Scanner console = new Scanner(System.in);

        String firstName = console.nextLine();
        String lastName = console.nextLine();
        int age = Integer.parseInt(console.nextLine());
        String town = console.nextLine();

        System.out.printf("You are " + firstName + " " + lastName + ',' + " a " + age + "-years old person from " + town + '.');
    }
}
