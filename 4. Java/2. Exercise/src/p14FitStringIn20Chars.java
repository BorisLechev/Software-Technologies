import java.util.Scanner;

public class p14FitStringIn20Chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.length() >= 20) {
            System.out.println(input.substring(0, 20));
        } else {
            System.out.print(input);
            System.out.println(repeatStarts("*", 20 - input.length()));
        }
    }

    public static String repeatStarts(String symbol, int count) {
        String result = "";

        for (int i = 0; i < count; i++) {
            result += symbol;
        }

        return result;
    }
}
