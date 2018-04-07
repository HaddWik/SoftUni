using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

class Program
{
    static void Main()
    {
        var starLetters = new List<char>(); starLetters.Add('s'); starLetters.Add('t'); starLetters.Add('a'); starLetters.Add('r');
        var numberOfMessages = int.Parse(Console.ReadLine());
        var totalScore = 0;

        for (int i = 0; i < numberOfMessages; i++)
        {
            var input = Console.ReadLine().ToLower().ToCharArray();
            var specialLetters = 0;
            for (int ar = 0; ar < input.Length; ar++)
            {
                var currentLetter = input[ar];

                if (starLetters.Contains(currentLetter))
                    specialLetters++;
            }
        }
    }
}
