using System;

namespace BeverageLabels
{
    class Program
    {
        static void Main(string[] args)
        {
            var name = Console.ReadLine();
            var volume = int.Parse(Console.ReadLine());
            var energy = int.Parse(Console.ReadLine());
            var sugar = int.Parse(Console.ReadLine());

            var calories = volume * energy / 100.0;
            var totalSugar = volume * sugar / 100.0;

            Console.WriteLine($"{volume}ml {name}:");
            Console.WriteLine($"{calories}kcal, {totalSugar}g sugars");
        }
    }
}
