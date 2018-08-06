import java.util.Arrays;
import java.util.Scanner;

public class p09MostFrequentNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();

        int bestCount = 0;
        int mostFrequentNumber = array[0];

        for (int i = 0; i < array.length; i++) {
            int currentCount = 0;

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    currentCount++;
                }
            }

            if (bestCount < currentCount) {
                bestCount = currentCount;
                mostFrequentNumber = array[i];
            }
        }

//        for (int i = 0; i < array.length; i++) {
//            for (int j = i+1; j < array.length; j++) {
//                if (array[i] == array[j]) {
//                    currentLength++;
//
//                    if (currentLength >= bestLength) {
//                        bestLength = currentLength;
//                        mostFrequentNumber = array[i];
//
//                    }
//                } else {
//                    currentLength = 1;
//                }
//            }
//
//        }

        System.out.println(mostFrequentNumber);
    }
}
