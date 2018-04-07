using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

class Program
{
    static void Main()
    {
        var budget = double.Parse(Console.ReadLine());
        var guests = int.Parse(Console.ReadLine());
        var bananasPrice = double.Parse(Console.ReadLine());
        var eggsPrice = double.Parse(Console.ReadLine());
        var berriesPrice = double.Parse(Console.ReadLine());

        double setsByGuestCount = guests / 6.0;
        var setsToBeMade = Math.Ceiling(setsByGuestCount);

        var totalCostOfBananas = setsToBeMade * (2 * bananasPrice);
        var totalCostOfEggs = setsToBeMade * (4 * eggsPrice);
        var totalCostOfBerries = setsToBeMade * (0.2 * berriesPrice);
        var totalCostOfProducts = totalCostOfBananas + totalCostOfEggs + totalCostOfBerries;

        if (totalCostOfProducts <= budget)
            Console.WriteLine($"Ivancho has enough money - it would cost {totalCostOfProducts:F2}lv.");
        else
            Console.WriteLine($"Ivancho will have to withdraw money - he will need {(totalCostOfProducts - budget):F2}lv more.");
    }
}
