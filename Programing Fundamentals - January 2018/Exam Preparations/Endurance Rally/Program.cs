using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

class Program
{
    static void Main()
    {
        var driversName = Console.ReadLine().Split(new[] { ' ' }, StringSplitOptions.RemoveEmptyEntries).ToArray();
        var trackZones = Console.ReadLine().Split(new[] { ' ' }, StringSplitOptions.RemoveEmptyEntries).Select(decimal.Parse).ToArray();
        var refuelIndexes = Console.ReadLine().Split(new[] { ' ' }, StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToArray();
        
        for (int i = 0; i < driversName.Length; i++)
        {
            var nameOfDriver = driversName[i]; // The Driver's Name
            var fuelOfDriver = (decimal)GetTotalFuel(driversName, i); // The drivers fuel
            var zoneIndex = 0;
            
            while (zoneIndex < trackZones.Length)
            {
                var currentZone = trackZones[zoneIndex];

                var refuel = false;

                for (int index = 0; index < refuelIndexes.Length; index++)
                {
                    var refuelIndexFromArr = refuelIndexes[index];
                    if (zoneIndex == refuelIndexFromArr) // Refuel
                    {
                        fuelOfDriver += currentZone;
                        refuel = true;
                    }
                }
                
                if (!refuel)
                    fuelOfDriver -= currentZone;

                if (fuelOfDriver <= 0)
                    break;
                
                zoneIndex++;
            }

            if (fuelOfDriver > 0)
                Console.WriteLine($"{nameOfDriver} - fuel left {fuelOfDriver:F2}");
            else
                Console.WriteLine($"{nameOfDriver} - reached {zoneIndex}");
        }
    }

    static int GetTotalFuel(string[] arr, int index)
    {
        var driverNameAsArr = arr[index].ToArray();
        var firstCharFromName = driverNameAsArr.First();
        var totalFuel = (int)firstCharFromName;
        
        return totalFuel;
    }
}