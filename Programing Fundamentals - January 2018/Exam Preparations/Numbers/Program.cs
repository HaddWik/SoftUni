using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

class Program
{
    static void Main()
    {
        var numbersArr = Console.ReadLine().Split(new[] { ' ' }, StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToArray();
        var totalSumOfNumbers = 0;
        var greaterNumbers = new List<int>();

        for (int i = 0; i < numbersArr.Length; i++)
        {
            var numberAtIndex = numbersArr[i];
            totalSumOfNumbers += numberAtIndex;
        }

        for (int i = 0; i < numbersArr.Length; i++)
        {
            var averageNumber = totalSumOfNumbers / numbersArr.Length;
            var numberAtIndex = numbersArr[i];

            if (numberAtIndex > averageNumber)
                greaterNumbers.Add(numberAtIndex);
        }

        if (greaterNumbers.Count > 0)
            Console.WriteLine(string.Join(" ", greaterNumbers.OrderByDescending(p => p).Take(5)));
        else
            Console.WriteLine("No");
    }
}