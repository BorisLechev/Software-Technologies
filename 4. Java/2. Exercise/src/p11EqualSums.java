import java.util.Arrays;
import java.util.Scanner;

public class p11EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        if (array.length == 1) {
            System.out.println(0);
            return;
        }

        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            int[] leftSide = Arrays.stream(array).limit(i).toArray();
            int[] rightSide = Arrays.stream(array).skip(i + 1).toArray();

            if (Arrays.stream(leftSide).sum() == Arrays.stream(rightSide).sum()) {
                System.out.println(i);
                counter++;
            }
        }

        if (counter == 0) {
            System.out.println("no");
        }
    }
}
