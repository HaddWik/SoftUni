using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

class Program
{
    static void Main()
    {
        var dict = new Dictionary<string, decimal>();

        var priceUs = decimal.Parse(Console.ReadLine()) / (decimal)0.58; // Price in leva
        var weightUs = long.Parse(Console.ReadLine());
        var priceUk = decimal.Parse(Console.ReadLine()) / (decimal)0.41; // Price in leva
        var weightUk = long.Parse(Console.ReadLine());
        var priceCh = decimal.Parse(Console.ReadLine()) * (decimal)0.27; // Price in leva
        var weightCh = long.Parse(Console.ReadLine());
        
        // Calculations and initialization
        dict["US store"] = priceUs / weightUs;
        dict["UK store"] = priceUk / weightUk;
        dict["Chinese store"] = priceCh / weightCh;

        // Sort the dictionary
        var sortedValues = dict.OrderByDescending(p => p.Value).ToDictionary(p => p.Key, p => p.Value);
        var lowestPrice = sortedValues.Last();
        var highestPrice = sortedValues.First();

        Console.WriteLine($"{lowestPrice.Key}. {lowestPrice.Value:F2} lv/kg");

        // Calc the difference
        var difference = highestPrice.Value - lowestPrice.Value;
        Console.WriteLine($"Difference {difference:F2} lv/kg");
    }
}