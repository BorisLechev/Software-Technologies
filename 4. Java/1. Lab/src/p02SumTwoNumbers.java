import java.util.Scanner;

public class p02SumTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double firstNumber = Double.parseDouble(input.nextLine());
        double secondNumber = Double.parseDouble(input.nextLine());

        System.out.println(firstNumber + secondNumber);
    }
}
