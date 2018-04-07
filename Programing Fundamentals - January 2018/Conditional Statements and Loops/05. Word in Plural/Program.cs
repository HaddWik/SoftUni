using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _05.Word_in_Plural
{
    class Program
    {
        static void Main(string[] args)
        {
            var word = Console.ReadLine();
            var puralWord = "";

            if (word.EndsWith("y"))
            {
               puralWord = word.Remove(word.Length - 1) + "ies";
            }
            else if (word.EndsWith("o") || word.EndsWith("s") || word.EndsWith("x") || word.EndsWith("z")
                || word.EndsWith("ch") || word.EndsWith("sh"))
            {
                puralWord = word + "es";
            }
            else
            {
                puralWord = word + "s";
            }

            Console.WriteLine(puralWord);
        }
    }
}
