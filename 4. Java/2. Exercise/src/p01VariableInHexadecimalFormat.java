import java.util.Scanner;

public class p01VariableInHexadecimalFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intNumber = Integer.parseInt(scanner.nextLine(), 16);

        System.out.println(intNumber);
    }
}
