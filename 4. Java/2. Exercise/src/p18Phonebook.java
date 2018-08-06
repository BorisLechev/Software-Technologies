import java.util.LinkedHashMap;
import java.util.Scanner;

public class p18Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, String> phonebook = new LinkedHashMap<>();

        String input = "";

        while (!((input = scanner.nextLine()).equals("END"))) {
            String[] currentCommand = input.split(" ");

            String letter = currentCommand[0];
            String name = currentCommand[1];

            if (currentCommand[0].equals("A")) {
                String phoneNumber = currentCommand[2];

                phonebook.put(name, phoneNumber);
            } else {
                if (phonebook.containsKey(name)) {
                    System.out.println(name + " -> " + phonebook.get(name));
                } else {
                    System.out.println("Contact " + name + " does not exist.");
                }
            }
        }
    }
}
