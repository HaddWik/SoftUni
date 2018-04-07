using System;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;

class Program
{
    static void Main()
    {
        var carDataInput = Console.ReadLine().Split(new[] { ' ' }, StringSplitOptions.RemoveEmptyEntries).ToList();
        var vehiclesSold = 0;

        while (true)
        {
            var inputLine = Console.ReadLine();

            if (inputLine.Contains("End of customers!"))
            {
                Console.WriteLine($"Vehicles left: {string.Join(", ", carDataInput)}");
                Console.WriteLine($"Vehicles sold: {vehiclesSold}");
                break;
            }

            var searchedVehicle = inputLine.Split(new[] { ' ' }, StringSplitOptions.RemoveEmptyEntries).ToArray();
            var vehicleType = char.Parse(searchedVehicle[0].ToCharArray().First().ToString().ToLower());
            var vehicleSeats = int.Parse(searchedVehicle[2]);
            var vehicleFound = false;
            
            for (int i = 0; i < carDataInput.Count; i++)
            {
                var dealerVehicleType = carDataInput[i].ToCharArray().First();
                var dealerVehicleSeats = int.Parse(Regex.Match(carDataInput[i], @"\d+").Value);

                if (vehicleType.Equals(dealerVehicleType) && vehicleSeats.Equals(dealerVehicleSeats))
                {
                    Console.WriteLine($"Yes, sold for {dealerVehicleType * dealerVehicleSeats}$");
                    carDataInput.RemoveAt(i);
                    vehiclesSold++;
                    vehicleFound = true;
                    break;
                }
            }

            if (!vehicleFound)
            {
                Console.WriteLine("No");
            }
        }
    }
}