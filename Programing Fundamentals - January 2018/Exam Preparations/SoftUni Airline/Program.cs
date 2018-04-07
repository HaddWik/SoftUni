using System;

class Program
{
    static void Main()
    {
        var flightsNumber = int.Parse(Console.ReadLine());
        decimal overallProfit = 0;

        for (int i = 0; i < flightsNumber; i++)
        {
            var adultPassangersCount = decimal.Parse(Console.ReadLine());
            var adultTickerPrice = decimal.Parse(Console.ReadLine());
            var youngPassangersCount = decimal.Parse(Console.ReadLine());
            var youngTickerPrice = decimal.Parse(Console.ReadLine());
            var fuelPricePerHour = decimal.Parse(Console.ReadLine());
            var fuelConsumPerHour = decimal.Parse(Console.ReadLine());
            var flightDuration = decimal.Parse(Console.ReadLine()); // In hours!

            var totalIncome = (adultPassangersCount * adultTickerPrice) + (youngPassangersCount * youngTickerPrice);
            var expenses = flightDuration * fuelConsumPerHour * fuelPricePerHour;
            var profit = totalIncome - expenses;

            if (totalIncome >= expenses)
                Console.WriteLine($"You are ahead with {profit:F3}$.");
            else
                Console.WriteLine($"We've got to sell more tickets! We've lost {profit:F3}$.");

            overallProfit += profit;
        }

        Console.WriteLine($"Overall profit -> {overallProfit:F3}$.");
        Console.WriteLine($"Average profit -> {(overallProfit / flightsNumber):F3}$.");
    }
}
