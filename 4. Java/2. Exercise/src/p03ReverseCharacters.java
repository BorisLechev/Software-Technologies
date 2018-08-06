import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p03ReverseCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> arrayList = new ArrayList<String>();

        for (int i = 0; i < 3; i++) {
            arrayList.add(scanner.nextLine());
        }

        Collections.reverse(arrayList);

        String string = String.join("", arrayList);
        System.out.println(string);
    }
}
