using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Geometry_Calculator
{
    class Program
    {
        static void Main(string[] args)
        {
            string figureType = Console.ReadLine();

            if (figureType == "triangle")
                Triangle();
            else if (figureType == "square")
                Square();
            else if (figureType == "rectangle")
                Rectangle();
            else if (figureType == "circle")
                Circle();
        }

        static void Circle()
        {
            double radius = double.Parse(Console.ReadLine());

            double area = Math.PI * Math.Pow(radius, 2);

            Console.WriteLine($"{area:F2}");
        }

        static void Rectangle()
        {
            double width = double.Parse(Console.ReadLine());
            double hight = double.Parse(Console.ReadLine());

            double area = width * hight;

            Console.WriteLine($"{area:F2}");
        }

        static void Square()
        {
            double side = double.Parse(Console.ReadLine());

            double area = Math.Pow(side, 2);

            Console.WriteLine($"{area:F2}");
        }

        static void Triangle()
        {
            double side = double.Parse(Console.ReadLine());
            double hight = double.Parse(Console.ReadLine());

            double area = side * hight / 2;

            Console.WriteLine($"{area:F2}");
        }
    }
}
