import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * 19. Phonebook Upgrade
 */
public class Exercise_19
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Map<String, String> phonebook = new TreeMap<>();

        while (true)
        {
            String text = input.nextLine();

            if (text.equals("END"))
                break;

            String[] tokens = text.split("\\s");
            String command = tokens[0];

            if (command.equals("A"))
            {
                String name = tokens[1];
                String phone = tokens[2];
                phonebook.put(name, phone);

            }
            else if (command.equals("S"))
            {
                String name = tokens[1];

                if (phonebook.containsKey(name))
                    System.out.printf("%s -> %s\n", name, phonebook.get(name));
                else
                    System.out.printf("Contact %s does not exist.\n", name);

            }
            else if (command.equals("ListAll"))
            {
                for (String key : phonebook.keySet())
                    System.out.printf("%s -> %s\n", key, phonebook.get(key));
            }
        }
    }
}