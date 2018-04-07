using System;
using System.Text.RegularExpressions;

namespace Extract_Emails
{
    class Program
    {
        static void Main(string[] args)
        {
            string toRegex = @"(?<=\s)[a-z0-9]+([-.]\w*)*@[a-z]{1,}([-.]\w*)*(\.[a-z]{1,})";

            var regexShmegex = new Regex(toRegex);
            string textToMatch = Console.ReadLine();

            var contains = regexShmegex.Matches(textToMatch);

            foreach (Match mail in contains)
            {
                Console.WriteLine(mail);
            }
        }
    }
}
