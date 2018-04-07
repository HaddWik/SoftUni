using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Phonebook
{
    class Program
    {
        static void Main(string[] args)
        {
            var contactList = new Dictionary<string, string>();

            while (true)
            {
                string[] command = Console.ReadLine().Split(' ').ToArray();

                if (command[0] == "END")
                    break;
                if (command[0] == "A")
                {
                    string name = command[1];
                    string phoneNumber = command[2];

                    contactList[name] = phoneNumber;
                }
                if (command[0] == "S")
                {
                    if (contactList.ContainsKey(command[1]))
                    {
                        Console.WriteLine("{0} -> {1}", command[1], contactList[command[1]]);
                    }
                    else
                    {
                        Console.WriteLine("Contact {0} does not exist.", command[1]);
                    }
                }
            }
        }
    }
}
