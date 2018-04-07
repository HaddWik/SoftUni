using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

class Program
{
    static void Main()
    {
        var amountOfWater = double.Parse(Console.ReadLine());
        var bottlesArr = Console.ReadLine().Split(new[] { ' ' }, StringSplitOptions.RemoveEmptyEntries).Select(double.Parse).ToArray();
        var bottleCapacity = double.Parse(Console.ReadLine());

        int endIndex = -1;
        bool hasWater = true;
        double leftWater = amountOfWater;

        if (IsOdd((int)amountOfWater))
        {
            Array.Reverse(bottlesArr);
        }

        for (int index = 0; index < bottlesArr.Length; index++)
        {
            leftWater -= bottleCapacity - bottlesArr[index];
            if (leftWater < 0 && hasWater)
            {
                endIndex = index;
                hasWater = false;
            }
        }

        if (leftWater < 0)
        {
            Console.WriteLine("We need more water!");
            endIndex = amountOfWater % 2 == 0 ? endIndex : bottlesArr.Length - 1 - endIndex;
            int leftBottle = amountOfWater % 2 == 0 ? bottlesArr.Length - endIndex : endIndex + 1;
            Console.WriteLine($"Bottles left: {leftBottle}");
            Console.Write($"With indexes: ");

            for (int i = 0; i < leftBottle; i++)
            {
                if (i == leftBottle - 1)
                {
                    Console.WriteLine(endIndex);
                }
                else
                {
                    Console.Write(endIndex + ", ");

                    if (amountOfWater % 2 == 0)
                    {
                        endIndex++;
                    }
                    else
                    {
                        endIndex--;
                    }
                }
            }

            Console.WriteLine($"We need {Math.Abs(leftWater)} more liters!");
        }
        else
        {
            Console.WriteLine("Enough water!");
            Console.WriteLine($"Water left: {leftWater}l.");
        }
    }

    static bool IsOdd(int value)
    {
        return value % 2 != 0;
    }
}
