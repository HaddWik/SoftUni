using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _07.Cake_Ingredients
{
    class Program
    {
        static void Main(string[] args)
        {
            var ingredient = "";
            var totalIngreidients = 0;

            while (true)
            {
                ingredient = Console.ReadLine();

                if (ingredient.Contains("Bake"))
                {
                    Console.WriteLine($"Preparing cake with {totalIngreidients} ingredients.");
                    break;
                }

                Console.WriteLine($"Adding ingredient {ingredient}.");
                totalIngreidients++;
            }
        }
    }
}
