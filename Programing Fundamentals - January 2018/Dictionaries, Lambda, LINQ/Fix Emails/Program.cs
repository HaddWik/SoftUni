using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fix_Emails
{
    class Program
    {
        static void Main(string[] args)
        {
            var emailBook = new Dictionary<string, string>();

            while (true)
            {
                var name = Console.ReadLine();

                if (name.Equals("stop"))
                    break;

                var email = Console.ReadLine();

                if (!email.ToLower().EndsWith("us"))
                    emailBook.Add(name, email);
            }

            foreach (var item in emailBook)
            {
                Console.WriteLine($"{item.Key} -> {item.Value}");
            }
        }
    }
}
