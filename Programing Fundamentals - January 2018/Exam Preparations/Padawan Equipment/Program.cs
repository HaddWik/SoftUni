using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

class Program
{
    static void Main()
    {
        var amountMoney = double.Parse(Console.ReadLine());
        var studentsCount = int.Parse(Console.ReadLine());
        var saberPrice = double.Parse(Console.ReadLine());
        var robesPrice = double.Parse(Console.ReadLine());
        var beltsPrice = double.Parse(Console.ReadLine());

        var freeBelts = Math.Floor(studentsCount / 6.0);
        var sabersDiscount = Math.Ceiling(studentsCount * 0.1);

        var totalCost = (saberPrice * (studentsCount + sabersDiscount)) + (robesPrice * studentsCount)
            + (beltsPrice * (studentsCount - freeBelts));

        if (totalCost <= amountMoney)
            Console.WriteLine($"The money is enough - it would cost {totalCost:F2}lv.");
        else
            Console.WriteLine($"Ivan Cho will need {(totalCost - amountMoney):F2}lv more.");
    }
}