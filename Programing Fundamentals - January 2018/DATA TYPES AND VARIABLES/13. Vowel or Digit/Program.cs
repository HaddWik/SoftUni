using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _13.Vowel_or_Digit
{
    class Program
    {
        static void Main(string[] args)
        {
            char n = char.Parse(Console.ReadLine());
            
            try
            {
                int b = int.Parse(n.ToString());

                Console.WriteLine("digit");
            }
            catch
            {
                string h = n.ToString().ToLower();

                if (h == "a" || h == "i" || h == "o" || h == "u" || h == "e")
                    Console.WriteLine("vowel");
                else
                    Console.WriteLine("other");
            }
        }
    }
}
