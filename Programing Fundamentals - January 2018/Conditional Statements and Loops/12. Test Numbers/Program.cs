using System;

namespace _12.Test_Numbers
{
    class Program
    {
        static void Main(string[] args)
        {
            var firstNum = int.Parse(Console.ReadLine());
            var secondNum = int.Parse(Console.ReadLine());
            var maxSum = int.Parse(Console.ReadLine());

            var sum = 0;
            var counter = 0;

            for (int i = firstNum; i >= 1; i--)
            {
                for (int k = 1; k <= secondNum; k++)
                {
                    var currentNum = (i * k) * 3;
                    sum += currentNum;
                    counter++;

                    if (sum >= maxSum)
                    {
                        Console.WriteLine($"{counter} combinations");
                        Console.WriteLine($"Sum: {sum} >= {maxSum}");
                        return;
                    }
                }
            }

            Console.WriteLine($"{counter} combinations");
            Console.WriteLine($"Sum: {sum}");
        }
    }
}
