using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Numbers_in_Reversed_Order
{
    class Program
    {
        static void Main(string[] args)
        {
            var num = Console.ReadLine();

            Console.WriteLine(reverseNumber(num));
        }

        static string reverseNumber(string num)
        {
            string reversedNumber = "";

            for (int i = num.Length - 1; i >= 0; i--)
            {
                reversedNumber += num[i];
            }

            return reversedNumber;
        }
    }
}
