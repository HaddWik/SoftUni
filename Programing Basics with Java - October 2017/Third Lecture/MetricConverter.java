import java.text.DecimalFormat;
import java.util.Scanner;

public class MetricConverter
{
    public static void main(String[] args)
    {
        DecimalFormat format = new DecimalFormat("#.##############");
        Scanner console = new Scanner(System.in);

        double value = Double.parseDouble(console.nextLine());
        String input = console.nextLine();
        String output = console.nextLine();

        double m = 1.0;
        double mm = 1000.0;
        double cm = 100.0;
        double mi = 0.000621371192;
        double in = 39.3700787;
        double km = 0.001;
        double ft = 3.2808399;
        double yd = 1.0936133;
        double result = 0;

        if (input.equals("m"))
        {
            if (output.equals("mm"))
            {
                result = value * mm;
            }
            else if (output.equals("cm"))
            {
                result = value* cm;
            }
            else if (output.equals("mi"))
            {
                result = value * mi;
            }
            else if (output.equals("in"))
            {
                result = value * in;
            }
            else if (output.equals("km"))
            {
                result = value * km;
            }
            else if (output.equals("ft"))
            {
                result = value * ft;
            }
            else if (output.equals("yd"))
            {
                result = value * yd;
            }
            else if (output.equals("m"))
            {
                result = value;
            }
        }
        else if (input.equals("mm"))
        {
            value = value/mm;
            if (output.equals("m"))
            {
                result = value;
            } else if (output.equals("mm")) {
                result = value*mm;
            } else if (output.equals("cm")) {
                result = value*cm;
            } else if (output.equals("mi")) {
                result = value*mi;
            } else if (output.equals("in")) {
                result = value*in;
            } else if (output.equals("km")) {
                result = value*km;
            } else if (output.equals("ft")) {
                result = value*ft;
            } else if (output.equals("yd")) {
                result = value*yd;
            }
        } else if (input.equals("cm")) {
            value = value/cm;
            if (output.equals("m")) {
                result = value;
            } else if (output.equals("cm")) {
                result = value*cm;
            } else if (output.equals("mm")) {
                result = value*mm;
            } else if (output.equals("mi")) {
                result = value*mi;
            } else if (output.equals("in")) {
                result = value*in;
            } else if (output.equals("km")) {
                result = value*km;
            } else if (output.equals("ft")) {
                result = value*ft;
            } else if (output.equals("yd")) {
                result = value*yd;
            }
        } else if (input.equals("mi")) {
            value = value/mi;
            if (output.equals("m")) {
                result = value;
            } else if (output.equals("mi")) {
                result = value*mi;
            } else if (output.equals("cm")) {
                result = value*cm;
            } else if (output.equals("mm")) {
                result = value*mm;
            } else if (output.equals("in")) {
                result = value*in;
            } else if (output.equals("km")) {
                result = value*km;
            } else if (output.equals("ft")) {
                result = value*ft;
            } else if (output.equals("yd")) {
                result = value*yd;
            }
        } else if (input.equals("in")) {
            value = value/in;
            if (output.equals("m")) {
                result = value;
            } else if (output.equals("in")) {
                result = value*in;
            } else if (output.equals("cm")) {
                result = value*cm;
            } else if (output.equals("mi")) {
                result = value*mi;
            } else if (output.equals("mm")) {
                result = value*mm;
            } else if (output.equals("km")) {
                result = value*km;
            } else if (output.equals("ft")) {
                result = value*ft;
            } else if (output.equals("yd")) {
                result = value*yd;
            }
        } else if (input.equals("km")) {
            value = value/km;
            if (output.equals("m")) {
                result = value;
            } else if (output.equals("km")) {
                result = value*km;
            } else if (output.equals("cm")) {
                result = value*cm;
            } else if (output.equals("mi")) {
                result = value*mi;
            } else if (output.equals("in")) {
                result = value*in;
            } else if (output.equals("mm")) {
                result = value*mm;
            } else if (output.equals("ft")) {
                result = value*ft;
            } else if (output.equals("yd")) {
                result = value*yd;
            }
        } else if (input.equals("ft")) {
            value = value/ft;
            if (output.equals("m")) {
                result = value;
            } else if (output.equals("ft")) {
                result = value*ft;
            } else if (output.equals("cm")) {
                result = value*cm;
            } else if (output.equals("mi")) {
                result = value*mi;
            } else if (output.equals("in")) {
                result = value*in;
            } else if (output.equals("km")) {
                result = value*km;
            } else if (output.equals("mm")) {
                result = value*mm;
            } else if (output.equals("yd")) {
                result = value*yd;
            }
        } else if (input.equals("yd")) {
            value = value/yd;
            if (output.equals("m")) {
                result = value;
            } else if (output.equals("yd")) {
                result = value*yd;
            } else if (output.equals("cm")) {
                result = value*cm;
            } else if (output.equals("mi")) {
                result = value*mi;
            } else if (output.equals("in")) {
                result = value*in;
            } else if (output.equals("km")) {
                result = value*km;
            } else if (output.equals("ft")) {
                result = value*ft;
            } else if (output.equals("mm")) {
                result = value*mm;
            }
        }
        System.out.println(format.format(result) + " " + output);
    }
}
