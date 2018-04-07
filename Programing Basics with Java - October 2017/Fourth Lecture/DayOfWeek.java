import java.util.Scanner;

public class DayOfWeek
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int day = Integer.parseInt(scanner.nextLine());
        String toBePrinted = "Error";

        switch (day)
        {
            case 1:
                toBePrinted = "Monday";
                break;
            case 2:
                toBePrinted = "Tuesday";
                break;
            case 3:
                toBePrinted = "Wednesday";
                break;
            case 4:
                toBePrinted = "Thursday";
                break;
            case 5:
                toBePrinted = "Friday";
                break;
            case 6:
                toBePrinted = "Saturday";
                break;
            case 7:
                toBePrinted = "Sunday";
                break;
        }

        if (toBePrinted.equalsIgnoreCase("error"))
            System.out.println(toBePrinted);
        else
            System.out.println(toBePrinted);
    }
}
