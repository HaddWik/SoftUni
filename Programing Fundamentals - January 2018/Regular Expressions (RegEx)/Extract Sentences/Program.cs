using System;
using System.Text.RegularExpressions;

namespace Extract_Sentences
{
    class Program
    {
        static void Main(string[] args)
        {
            string word = Console.ReadLine();

            string[] text = Console.ReadLine()
                .Split(".!?".ToCharArray(), StringSplitOptions.RemoveEmptyEntries);

            string pattern = $@"(\b{word}\b)";

            foreach (string sentence in text)
            {
                Match match = Regex.Match(sentence, pattern);

                if (match.Success)
                {
                    Console.WriteLine(sentence.Trim());
                }
            }
        }
    }
}
