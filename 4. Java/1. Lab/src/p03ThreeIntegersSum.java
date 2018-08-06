import java.util.Scanner;

public class p03ThreeIntegersSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();

        if (!checkThreeIntegers(firstNumber, secondNumber, thirdNumber) &&
                !checkThreeIntegers(secondNumber, thirdNumber, firstNumber) &&
                !checkThreeIntegers(thirdNumber, firstNumber, secondNumber)) {
            System.out.println("No");
        }
    }

    public static boolean checkThreeIntegers(int num1, int num2, int sum) {
        if (num1 + num2 != sum) {
            return false;
        }

        if (num1 <= num2) {
            System.out.printf("%d + %d = %d%n", num1, num2, sum);
        } else {
            System.out.printf("%d + %d = %d%n", num2, num1, sum);
        }

        return true;
    }
}
