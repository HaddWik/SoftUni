using System;
using System.Collections.Generic;
using System.Linq;

class Program
{
    static void Main()
    {
        var playerScores = new Dictionary<string, int>();

        var countOfPlayers = int.Parse(Console.ReadLine());

        for (int i = 0; i < countOfPlayers; i++)
        {
            var playerName = Console.ReadLine();
            var initialScore = int.Parse(Console.ReadLine());
            var scoreAfterCalc = initialScore;

            var nameAsCharArr = playerName.ToArray();

            for (int charIndex = 0; charIndex < nameAsCharArr.Length; charIndex++)
            {
                var letterNumber = (int)nameAsCharArr[charIndex];

                if (!IsOdd(letterNumber))
                    scoreAfterCalc += letterNumber;
                else
                    scoreAfterCalc -= letterNumber;
            }

            playerScores[playerName] = scoreAfterCalc;
        }

        // Sort
        var sortedScores = playerScores.OrderByDescending(pair => pair.Value).ToDictionary(pair => pair.Key, pair => pair.Value);
        var printedWinner = false;

        foreach (var item in sortedScores)
        {
            if(!printedWinner)
            {
                Console.WriteLine($"The winner is {item.Key} - {item.Value} points");
                printedWinner = true;
            }
        }
    }

    static bool IsOdd(int value)
    {
        return value % 2 != 0;
    }
}