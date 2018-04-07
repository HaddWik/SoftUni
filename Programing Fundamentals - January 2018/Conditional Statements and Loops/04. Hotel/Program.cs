using System;

namespace _04.Hotel
{
    class Program
    {
        static void Main(string[] args)
        {
            var month = Console.ReadLine();
            var nights = int.Parse(Console.ReadLine());

            var studioPrice = 0.0;
            var doubleRoomPrice = 0.0;
            var suitePrice = 0.0;

            switch(month)
            {
                case "May":
                case "October":
                    {
                        studioPrice = 50;
                        doubleRoomPrice = 65;
                        suitePrice = 75;
                        break;
                    }
                case "June":
                case "September":
                    {
                        studioPrice = 60;
                        doubleRoomPrice = 72;
                        suitePrice = 82;
                        break;
                    }
                case "July":
                case "August":
                case "December":
                    {
                        studioPrice = 68;
                        doubleRoomPrice = 77;
                        suitePrice = 89;
                        break;
                    }
            }

            if ((month == "May" || month == "October") && nights > 7)
            {
                studioPrice *= 0.95;
            }
            else if ((month == "June" || month == "September") && nights > 14)
            {
                doubleRoomPrice *= 0.9;
            }
            else if ((month == "July" || month == "August" || month == "December") && nights > 14)
            {
                suitePrice *= 0.85;
            }

            double totalPriceStudio = studioPrice * nights;
            double totalPriceDouble = doubleRoomPrice * nights;
            double totalPriceSuite = suitePrice * nights;

            if ((month == "September" || month == "October") && nights > 7)
            {
                totalPriceStudio -= studioPrice;
            }

            Console.WriteLine($"Studio: {totalPriceStudio:f2} lv.");
            Console.WriteLine($"Double: {totalPriceDouble:f2} lv.");
            Console.WriteLine($"Suite: {totalPriceSuite:f2} lv.");
        }
    }
}
