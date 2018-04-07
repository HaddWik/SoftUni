using System;

namespace _02.Choose_a_Drink_2._0
{
    class Program
    {
        static void Main(string[] args)
        {
            var proffession = Console.ReadLine();
            var quantity = int.Parse(Console.ReadLine());
            
            var price = 0.0;

            switch (proffession)
            {
                case "Athlete": price = 0.70; break;
                case "Businessman": price = 1.00; break;
                case "Businesswoman": price = 1.00; break;
                case "SoftUni Student": price =  1.70; break;
                default: price = 1.20; break;
            }

            var totalPrice = price * quantity;
            Console.WriteLine($"The {proffession} has to pay {totalPrice:F2}.");
        }
    }
}
