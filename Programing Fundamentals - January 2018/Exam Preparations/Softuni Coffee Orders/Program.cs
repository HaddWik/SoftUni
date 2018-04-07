using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

class Program
{
    static void Main()
    {
        var numberOfOrders = int.Parse(Console.ReadLine());
        decimal totalPrice = 0;

        for (int i = 0; i < numberOfOrders; i++)
        {
            var pricePerCapsule = decimal.Parse(Console.ReadLine());
            var orderDate = Console.ReadLine().Split(new[] { '/' }).Select(int.Parse).ToArray();
            var capsulesCount = int.Parse(Console.ReadLine());

            var daysInMonth = System.DateTime.DaysInMonth(orderDate[2], orderDate[1]);
            
            decimal totalOrderPrice = ((daysInMonth * capsulesCount) * pricePerCapsule);
            totalPrice += totalOrderPrice;
            Console.WriteLine($"The price for the coffee is: ${totalOrderPrice:F2}");
        }

        Console.WriteLine($"Total: ${totalPrice:F2}");
    }
}