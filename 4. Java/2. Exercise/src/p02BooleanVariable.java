import java.util.Scanner;

public class p02BooleanVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Boolean boolValue = Boolean.parseBoolean(scanner.nextLine());

        System.out.println(boolValue ? "Yes" : "No");
    }
}
