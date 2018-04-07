using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Hello__Name
{
    class Program
    {
        static void Main(string[] args)
        {
            var name = Console.ReadLine();

            sayHello(name);
        }

        private static void sayHello(string name)
        {
            Console.WriteLine($"Hello, {name}!");
        }
    }
}
