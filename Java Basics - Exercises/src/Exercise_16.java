import java.util.Scanner;

/**
 * 16. URL Parser
 */
public class Exercise_16
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String url = input.nextLine();
        String protocol = "",server,resource = "";

        int protocolIndex = url.indexOf("://");
        if (protocolIndex != -1)
        {
            protocol = url.substring(0, protocolIndex);
            url = url.substring(protocolIndex + 3);
        }

        int serverIndex = url.indexOf("/");
        if (serverIndex != -1)
        {
            server = url.substring(0, serverIndex);
            resource = url.substring(serverIndex + 1);
        }
        else
            server = url;

        System.out.printf("[protocol] = \"%s\"\n" + "[server] = \"%s\"\n" + "[resource] = \"%s\"\n", protocol, server, resource);
    }
}