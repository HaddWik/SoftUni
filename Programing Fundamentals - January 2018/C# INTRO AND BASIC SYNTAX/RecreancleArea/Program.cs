using System;

namespace RecreancleArea
{
    class Program
    {
        static void Main(string[] args)
        {
            var width = double.Parse(Console.ReadLine());
            var height = double.Parse(Console.ReadLine());

            Console.WriteLine($"{width*height:F2}");
        }
    }
}
