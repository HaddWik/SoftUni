using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Snowmen
{
    class Program
    {
        static void Main()
        {
            int[] seq = Console.ReadLine().Split().Select(int.Parse).ToArray();

            while (seq.Length > 1)
            {
                for (int attacker = 0; attacker < seq.Length; attacker++)
                {
                    int target = seq[attacker] % seq.Length;
                    int diff = Math.Abs(attacker - target);

                    if (attacker == target)
                    {
                        Console.WriteLine($"");
                    }
                    else if (true)
                    {

                    }
                }
            }
        }
    }
}
