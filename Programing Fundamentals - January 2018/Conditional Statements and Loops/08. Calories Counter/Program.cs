using System;

namespace _08.Calories_Counter
{
    class Program
    {
        static void Main(string[] args)
        {
            var n = int.Parse(Console.ReadLine());
            var totalCalories = 0;

            for (int i = 0; i < n; i++)
            {
                var ingredient = Console.ReadLine().ToLower();
                totalCalories += getCalories(ingredient);
            }

            Console.WriteLine($"Total calories: {totalCalories}");
        }

        static int getCalories(String ingredient)
        {
            if (ingredient.Contains("cheese"))
                return 500;
            else if (ingredient.Contains("tomato sauce"))
                return 150;
            else if (ingredient.Contains("salami"))
                return 600;
            else if (ingredient.Contains("pepper"))
                return 50;
            else
                return 0;
        }
    }
}
