using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

class Program
{
    static void Main()
    {
        var studentsCount = int.Parse(Console.ReadLine());

        var gryffindorCount = 0;
        var slytherinCount = 0;
        var ravenclawCount = 0;
        var hufflepuffCount = 0;


        for (int i = 0; i < studentsCount; i++)
        {
            var studentName = Console.ReadLine().Split(new[] { ' ' }).ToArray();
            var studentNameFirstChar = studentName[0].ToString().First();
            var studentNameLastChar = studentName[1].ToString().First();
            var studentNameArr = (studentName[0] + studentName[1]).ToArray();
            var studentScore = 0;

            for (int charIndex = 0; charIndex < studentNameArr.Length; charIndex++)
            {
                studentScore += (int)studentNameArr[charIndex];
            }

            var scoreDivided = studentScore % 4;

            if (scoreDivided == 0)
            {
                Console.WriteLine($"Gryffindor {studentScore}{studentNameFirstChar}{studentNameLastChar}");
                gryffindorCount++;
            }

            if (scoreDivided == 1)
            {
                Console.WriteLine($"Slytherin {studentScore}{studentNameFirstChar}{studentNameLastChar}");
                slytherinCount++;
            }

            if (scoreDivided == 2)
            {
                Console.WriteLine($"Ravenclaw {studentScore}{studentNameFirstChar}{studentNameLastChar}");
                ravenclawCount++;
            }

            if (scoreDivided == 3)
            {
                Console.WriteLine($"Hufflepuff {studentScore}{studentNameFirstChar}{studentNameLastChar}");
                hufflepuffCount++;
            }
        }

        Console.WriteLine();
        Console.WriteLine($"Gryffindor: {gryffindorCount}");
        Console.WriteLine($"Slytherin: {slytherinCount}");
        Console.WriteLine($"Ravenclaw: {ravenclawCount}");
        Console.WriteLine($"Hufflepuff: {hufflepuffCount}");

    }
}
