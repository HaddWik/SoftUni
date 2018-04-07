using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace A_Miner_Task
{
    class Program
    {
        static void Main(string[] args)
        {
            var resources = new Dictionary<string, long>();

            while (true)
            {
                var itemName = Console.ReadLine();

                if (itemName.Equals("stop"))
                    break;

                var itemCount = long.Parse(Console.ReadLine());

                if (!resources.ContainsKey(itemName))
                    resources.Add(itemName, 0);

                resources[itemName] += itemCount;
            }

            foreach (var item in resources)
            {
                Console.WriteLine($"{item.Key} -> {item.Value}");
            }
        }
    }
}
