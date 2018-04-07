import javax.sound.midi.SysexMessage;
import java.util.Scanner;

/**
 * Author HaddWik on 17/10/2017.
 */
public class USDToBGN
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        double input = Double.parseDouble(console.nextLine());
        double result = input * 1.79549;

        System.out.printf("%.2f BGN", result);
    }
}
