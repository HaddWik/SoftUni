import java.util.Scanner;

/**
 * Author HaddWik on 26/10/2017.
 */
public class Scholarship
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        double income = Double.parseDouble(console.nextLine());
        double grade = Double.parseDouble(console.nextLine());
        double minSalary = Double.parseDouble(console.nextLine());

        double scholarship1 = 0.0;
        double scholarship2 = 0.0;

        if (grade > 4.5 && grade < 5.50)
            scholarship1 = 0.35 * minSalary;

        if (grade >= 5.50)
            scholarship2 = grade * 25;

        if (grade < 4.5)
        {
            System.out.println("You cannot get a scholarship!");
            return;
        }

        if (grade < 5.50 && income > minSalary)
        {
            System.out.println("You cannot get a scholarship!");
            return;
        }

        if (scholarship2 >= scholarship1)
            System.out.println("You get a scholarship for excellent results " + (int)scholarship2 + " BGN");
        else
            System.out.println("You get a Social scholarship " + (int)scholarship1 + " BGN");
    }
}
