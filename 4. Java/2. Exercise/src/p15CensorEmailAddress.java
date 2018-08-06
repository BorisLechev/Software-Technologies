import java.util.Scanner;

public class p15CensorEmailAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mail = scanner.nextLine();

        String username = mail.substring(0, mail.indexOf("@"));
        String domain = mail.substring(mail.indexOf("@"), mail.length());

        String text = scanner.nextLine();

        String replacer = repeatStars(username, domain);

        text = text.replaceAll(mail, replacer);

        System.out.println(text);
    }

    public static String repeatStars(String username, String domain) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < username.length(); i++) {
            builder.append("*");
        }

        builder.append(domain);

        return builder.toString();
    }
}
