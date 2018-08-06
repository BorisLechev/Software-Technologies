import java.util.Scanner;

public class p04VowelOrDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String character = scanner.nextLine();

        try {
            int number = Integer.parseInt(character);
            System.out.println("digit");
        } catch (Exception s) {
            if (character.equals("a") || character.equals("e") || character.equals("i") || character.equals("o")
                    || character.equals("u")) {
                System.out.println("vowel");
            } else {
                System.out.println("other");
            }
        }
    }
}
