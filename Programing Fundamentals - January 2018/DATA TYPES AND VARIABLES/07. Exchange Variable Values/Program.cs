using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _07.Exchange_Variable_Values
{
    class Program
    {
        static void Main(string[] args)
        {
            var input1 = int.Parse(Console.ReadLine());
            var input2 = int.Parse(Console.ReadLine());

            Console.WriteLine("Before:");
            Console.WriteLine("a = " + input1);
            Console.WriteLine("b = " + input2);
            Console.WriteLine("After:");
            Console.WriteLine("a = " + input2);
            Console.WriteLine("b = " + input1);
        }
    }
}
