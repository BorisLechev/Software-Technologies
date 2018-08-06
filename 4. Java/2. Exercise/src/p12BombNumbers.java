import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p12BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int[] twoNumbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int specialBomb = twoNumbers[0];
        int power = twoNumbers[1];

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == specialBomb) {
                int leftIndex = Math.max(i - power, 0);
                int rightIndex = Math.min(i + power, list.size() - 1);

                list.subList(leftIndex, rightIndex + 1).clear();

                i = 0;
            }
        }

        System.out.println(list.stream().mapToInt(Integer::intValue).sum());
    }
}
