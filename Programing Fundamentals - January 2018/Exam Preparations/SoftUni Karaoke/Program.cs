using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

class Program
{
    static void Main()
    {
        var listOfParticipants = Console.ReadLine();//.Split(new[] { ',' }, StringSplitOptions.RemoveEmptyEntries).ToArray();
        var availableSongs = Console.ReadLine();//.Split(new[] { ',' }, StringSplitOptions.RemoveEmptyEntries).ToArray();
        var rewardsPerParticipant = new Dictionary<string, List<string>>();

        while (true)
        {
            var line = Console.ReadLine().Split(new[] { ", " }, StringSplitOptions.RemoveEmptyEntries).ToArray();

            if (line.Contains("dawn"))
            {
               if (rewardsPerParticipant.Count == 0)
                    Console.WriteLine();
               else
               {
                    foreach (KeyValuePair<string, List<string>> pair in rewardsPerParticipant.OrderByDescending(a => a.Value.Distinct().ToList().Count).ThenBy(n => n.Key))
                    {
                        List<string> awards = pair.Value.Distinct().ToList();

                        Console.WriteLine($"{pair.Key}: {awards.Count} awards");
                        foreach (string award in awards.OrderBy(n => n))
                        {
                            Console.WriteLine($"--{award}");
                        }
                    }
               }
               break;
            }

            var participantName = line[0];
            var performingSongName = line[1];
            var awardPerSong = line[2];
            
            if (listOfParticipants.Contains(participantName) && availableSongs.Contains(performingSongName))
            {
                if (!rewardsPerParticipant.ContainsKey(participantName))
                    rewardsPerParticipant.Add(participantName, new List<string>());


                rewardsPerParticipant[participantName].Add(awardPerSong);
            }
        }
    }
}