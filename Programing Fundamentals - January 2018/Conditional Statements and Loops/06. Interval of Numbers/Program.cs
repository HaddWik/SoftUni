using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _06.Interval_of_Numbers
{
    class Program
    {
        static void Main(string[] args)
        {
            var start = int.Parse(Console.ReadLine());
            var end = int.Parse(Console.ReadLine());

            if (start < end)
            {
                for (int i = start; i < end + 1; i++)
                {
                    Console.WriteLine(i);
                }
            }
            else
            {
                for (int i = end; i < start + 1; i++)
                {
                    Console.WriteLine(i);
                }
            }
        }
    }
}
