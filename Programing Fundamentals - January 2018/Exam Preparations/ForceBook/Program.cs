using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

class Program
{
    static void Main()
    {
        var forceData = new Dictionary<string, List<string>>();

        while (true)
        {
            var input = Console.ReadLine();

            if (input.Contains("Lumpawaroo"))
            {
                foreach (var t in forceData.OrderBy(p => p.Key))
                {
                    var teamName = t.Key;
                    var teamUsers = t.Value;

                    if (teamUsers.Count > 0)
                        Console.WriteLine($"Side: {teamName}, Members: {teamUsers.Count}");

                    foreach (var u in teamUsers)
                    {
                        var teamUserName = u.ToString();
                        Console.WriteLine($"! {teamUserName}");
                    }
                }
                break;
            }

            if (input.Contains("|")) // Register
            {
                string[] userData = input.Split(new string[] { " | " }, StringSplitOptions.RemoveEmptyEntries).ToArray();
                var forceSide = userData[0];
                var forceUser = userData[1];

                if (!forceData.ContainsKey(forceSide))
                {
                    forceData.Add(forceSide, new List<string>());
                    forceData[forceSide].Add(forceUser);
                    continue;
                }

                foreach (var t in forceData)
                {
                    foreach (var u in t.Value)
                    {
                        var teamUserName = u.ToString();
                        
                        if (!teamUserName.Equals(forceUser))
                            forceData[forceSide].Add(forceUser);
                    }
                }
            }
            else // Switch side
            {
                string[] userData = input.Split(new string[] { " -> " }, StringSplitOptions.RemoveEmptyEntries).ToArray();
                var forceUser = userData[0];
                var forceSide = userData[1];
                
                foreach (var t in forceData)
                {
                    var teamName = t.Key;
                    var teamUsers = t.Value;

                    if (teamName.Equals(forceSide))
                    {
                        teamUsers.RemoveAll(x => ((string)x) == forceUser);
                    }
                }

                foreach (var teams in forceData)
                {
                    var tName = teams.Key;
                    var tUsers = teams.Value;

                    if (!tName.Equals(forceSide))
                    {
                        tUsers.RemoveAll(x => ((string)x) == forceUser);
                        forceData[tName].Add(forceUser);
                    }
                }

                Console.WriteLine($"{forceUser} joins the {forceSide} side!");
            }
        }
    }
}