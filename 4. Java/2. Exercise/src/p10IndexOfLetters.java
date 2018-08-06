import java.util.Scanner;

public class p10IndexOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            System.out.println(String.format("%s -> %d", input.charAt(i), (int)(input.charAt(i)) - 97));
        }
    }
}
