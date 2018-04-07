using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

class Program
{
    static void Main()
    {
        var arr = Console.ReadLine().Split(new[] { ' ' }, StringSplitOptions.RemoveEmptyEntries).Select(long.Parse).ToArray();

        while(true)
        {
            string[] data = Console.ReadLine().Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries);
            string command = data[0];

            if (command.Equals("end"))
            {
                Console.WriteLine(string.Join(", ", arr));
                break;
            }

            if (command.Equals("swap"))
            {
                var firstIndex = int.Parse(data[1]);
                var secondIndex = int.Parse(data[2]);

                var valueFromFirstCell = arr[firstIndex];
                var valueFromSecondCell = arr[secondIndex];

                arr[firstIndex] = valueFromSecondCell;
                arr[secondIndex] = valueFromFirstCell;
            }

            if (command.Equals("multiply"))
            {
                var firstIndex = int.Parse(data[1]);
                var secondIndex = int.Parse(data[2]);

                var numberToBeMultiplied = arr[firstIndex];
                var numberToBeMultipliedBy = arr[secondIndex];
                
                arr[firstIndex] = numberToBeMultiplied * numberToBeMultipliedBy;
            }

            if (command.Equals("decrease"))
            {
                for (int i = 0; i < arr.Length; i++)
                {
                    var currentValue = arr[i];
                    var decreaseValue = currentValue - 1;
                    arr[i] = decreaseValue;
                }
            }
        }
    }
}