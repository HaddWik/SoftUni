using System;

namespace _09.Count_the_Integers
{
    class Program
    {
        static void Main(string[] args)
        {
            var count = 0;
            while (true)
            {
                try
                {
                    var number = int.Parse(Console.ReadLine());
                    count++;
                }
                catch (Exception)
                {
                    break;
                }
            }

            Console.WriteLine(count);
        }
    }
}
