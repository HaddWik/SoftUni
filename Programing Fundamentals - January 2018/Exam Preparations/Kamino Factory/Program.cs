using System;
using System.Collections.Generic;
using System.Linq;

class Program
{
    static void Main()
    {
        var lenghtOfSec = int.Parse(Console.ReadLine());
        var sampleNumber = 0;
        int[] bestArray = new int[lenghtOfSec];

        var bestSeq = 0;
        var bestIndex = 9999;
        var bestSum = 0;
        var bestSample = 0;

        while (true)
        {
            var input = Console.ReadLine();
            
            if (input.Contains("Clone them!"))
            {
                Console.WriteLine($"Best DNA sample {bestSample} with sum: {bestSum}.");
                Console.WriteLine(string.Join(" ", bestArray));
                break;
            }

            var arr = input.Split(new[] { '!' }, StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToArray();
            sampleNumber++;
            var matchesFound = 0;
            var totalMatches = 0;
            var seqFound = 0;
            var indexOfFirstSeq = 0;

            for (int i = 0; i < arr.Length; i++)
            {
                var numberAtIndex = arr[i];

                if (numberAtIndex == 1)
                {
                    if (matchesFound > 0)
                    {
                        seqFound++;
                        indexOfFirstSeq = i;
                    }

                    matchesFound++;
                    totalMatches++;
                    continue;
                }
                else
                {
                    matchesFound = 0;
                }
            }
            
            if (seqFound > 0)
            {
                if (seqFound > bestSeq)
                {
                    bestSeq = seqFound;
                    bestArray = arr; // Best by seq count
                    bestSum = totalMatches;
                    bestSample = sampleNumber;
                    continue;
                }
                else if (bestSeq == seqFound)
                {
                    if (indexOfFirstSeq < bestIndex)
                    {
                        bestIndex = indexOfFirstSeq;
                        bestArray = arr; // Best by first index
                        bestSum = totalMatches;
                        bestSample = sampleNumber;
                        continue;
                    }
                    else if (bestIndex == indexOfFirstSeq)
                    {
                        if (totalMatches == bestSum)
                        {
                            bestArray = arr; // Best by sum
                            bestSample = sampleNumber;
                            continue;
                        }
                        else
                        {
                            bestSum = totalMatches;
                            bestArray = arr; // Best by sum
                            bestSample = sampleNumber;
                            continue;
                        }
                    }
                }   
            }
        }
    }
}