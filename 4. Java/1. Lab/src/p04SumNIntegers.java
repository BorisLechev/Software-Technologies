import java.util.Scanner;

public class p04SumNIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int countOfNumbers = Integer.parseInt(input.nextLine());

        int sum = 0;

        for (int i = 0; i < countOfNumbers; i++) {
            sum+= Integer.parseInt(input.nextLine());
        }

        System.out.println(sum);
    }
}
