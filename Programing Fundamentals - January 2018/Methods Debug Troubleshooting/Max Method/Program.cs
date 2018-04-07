using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Max_Method
{
    class Program
    {
        static void Main(string[] args)
        {
            var num1 = int.Parse(Console.ReadLine());
            var num2 = int.Parse(Console.ReadLine());
            var num3 = int.Parse(Console.ReadLine());

            var maxNumber = getMax(num1, getMax(num2, num3));
            Console.WriteLine(maxNumber);
        }

        static int getMax(int a, int b)
        {
            if (a > b)
                return a;
            else
                return b;
        }
    }
}
