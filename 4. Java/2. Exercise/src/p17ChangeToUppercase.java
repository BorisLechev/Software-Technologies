import java.util.Scanner;

public class p17ChangeToUppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int openTagIndex = input.indexOf("<upcase>");
        int closeTagIndex = input.indexOf("</upcase>");

        while (openTagIndex != -1 && closeTagIndex != -1) {
            String textBetweenTags = input.substring(openTagIndex + "<upcase>".length(), closeTagIndex);

            input = input.replace("<upcase>" + textBetweenTags + "</upcase>", textBetweenTags.toUpperCase());

            openTagIndex = input.indexOf("<upcase>");
            closeTagIndex = input.indexOf("</upcase>");
        }

        System.out.println(input);
    }
}
