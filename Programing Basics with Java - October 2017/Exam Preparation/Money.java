package ProgrammingBasicsExams._17_July_2016;

import java.util.Scanner;

/**
 * Author HaddWik on 13/01/2018.
 */
public class Money
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int bitcoins = Integer.parseInt(console.nextLine());
        double chinseUana = Double.parseDouble(console.nextLine());
        double commnins = Double.parseDouble(console.nextLine());

        double bitcoin = 1168;
        double chinseuan = 0.15;
        double dolar = 1.76;
        double euro = 1.95;

        double totalBitcoin = bitcoins * bitcoin;
        double totalUana = chinseUana * chinseuan * dolar;
        double total = (totalUana + totalBitcoin) / euro;

        System.out.printf("%.2f", total - commnins / 100 * total);
    }
}
