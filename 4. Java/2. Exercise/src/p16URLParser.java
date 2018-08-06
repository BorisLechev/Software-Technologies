import java.util.Scanner;

public class p16URLParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String url = scanner.nextLine();

        if (url.contains("://")) {
            String[] splittedUrl = url.split("://");

            String protocol = splittedUrl[0];

            if (!splittedUrl[1].contains("/")) {
                System.out.println(String.format("[protocol] = \"%s\"", protocol));
                System.out.println(String.format("[server] = \"%s\"", splittedUrl[1]));
                System.out.println(String.format("[resource] = \"\""));
                return;
            }

            String server = splittedUrl[1].substring(0, splittedUrl[1].indexOf("/"));
            String resource = splittedUrl[1].substring(splittedUrl[1].indexOf("/") + 1, splittedUrl[1].length());

            System.out.println(String.format("[protocol] = \"%s\"", protocol));
            System.out.println(String.format("[server] = \"%s\"", server));
            System.out.println(String.format("[resource] = \"%s\"", resource));
        } else {
            System.out.println("[protocol] = \"\"");

            System.out.println(String.format("[server] = \"%s\"", url));
            System.out.println("[resource] = \"\"");
        }
    }
}