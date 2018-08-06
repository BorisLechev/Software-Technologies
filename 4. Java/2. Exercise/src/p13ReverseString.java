import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p13ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());

        StringBuilder builder = new StringBuilder();

        for (int i = list.size() - 1; i >= 0; i--) {
            builder.append(list.get(i));
        }

        System.out.println(builder.toString());
    }
}
