using System;

namespace _03.Restaurant_Discount
{
    class Program
    {
        static void Main(string[] args)
        {
            var groupSize = int.Parse(Console.ReadLine());
            var package = Console.ReadLine();

            var hallType = 0;
            var hallName = "";
            var price = 0.0;

            if (groupSize <= 50)
            {
                hallType = 1;
                hallName = "Small Hall";
            }
            else if (groupSize > 50 && groupSize <= 100)
            {
                hallType = 2;
                hallName = "Terrace";
            }
            else if (groupSize > 100 && groupSize <= 120)
            {
                hallType = 3;
                hallName = "Great Hall";
            }
            else
            {
                Console.WriteLine("We do not have an appropriate hall.");
                return;
            }
            
            if (package.Contains("Normal"))
            {
                switch(hallType)
                {
                    case 1: price = ((2500 + 500) - 0.05 * (2500 + 500)); break; // Small Hall
                    case 2: price = ((5000 + 500) - 0.05 * (5000 + 500)); break; // Terrace
                    case 3: price = ((7500 + 500) - 0.05 * (7500 + 500)); break; // Great Hall
                }
            }
            else if (package.Contains("Gold"))
            {
                switch (hallType)
                {
                    case 1: price = ((2500 + 750) - 0.1 * (2500 + 750)); break; // Small Hall
                    case 2: price = ((5000 + 750) - 0.1 * (5000 + 750)); break; // Terrace
                    case 3: price = ((7500 + 750) - 0.1 * (7500 + 750)); break; // Great Hall
                }
            }
            else if (package.Contains("Platinum"))
            {
                switch (hallType)
                {
                    case 1: price = ((2500 + 1000) - 0.15 * (2500 + 1000)); break; // Small Hall
                    case 2: price = ((5000 + 1000) - 0.15 * (5000 + 1000)); break; // Terrace
                    case 3: price = ((7500 + 1000) - 0.15 * (7500 + 1000)); break; // Great Hall
                }
            }

            Console.WriteLine($"We can offer you the {hallName}");
            Console.WriteLine($"The price per person is {price/groupSize:F2}$");
        }
    }
}
