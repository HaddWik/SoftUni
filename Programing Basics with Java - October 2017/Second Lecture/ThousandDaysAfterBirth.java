import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Author HaddWik on 17/10/2017.
 */
public class ThousandDaysAfterBirth
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println(LocalDate.parse(input, dateTimeFormatter).plusDays(999).format(dateTimeFormatter));
    }
}
