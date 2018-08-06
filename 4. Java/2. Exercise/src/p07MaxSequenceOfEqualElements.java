import java.util.Arrays;
import java.util.Scanner;

public class p07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split("\\s"))
                .mapToInt(Integer::parseInt).toArray();

        int currentStart = 0;
        int currentLength = 1;
        int bestStart = 0;
        int bestLength = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[currentStart] == array[i]) {
                currentLength++;

                if (currentLength > bestLength) {
                    bestLength = currentLength;
                    bestStart = currentStart;

                }
            } else {
                currentLength = 1;
                currentStart = i;
            }
        }

        for (int i = bestStart; i < bestLength + bestStart; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
