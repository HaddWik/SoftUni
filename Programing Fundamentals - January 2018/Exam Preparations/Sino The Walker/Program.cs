using System;
using System.Globalization;

class Program
{
    static void Main()
    {
        string timeSimoLeft = Console.ReadLine();
        int stepsToHome = int.Parse(Console.ReadLine());
        int timeForEachStep = int.Parse(Console.ReadLine());

        double totalTravelTime = stepsToHome * timeForEachStep;

        var timeResult = DateTime.ParseExact(timeSimoLeft, "HH:mm:ss", CultureInfo.InvariantCulture).AddSeconds(totalTravelTime);
        var formattedTime = timeResult.ToString("HH:mm:ss");
        Console.WriteLine($"Time Arrival: {formattedTime}");
    }
}
