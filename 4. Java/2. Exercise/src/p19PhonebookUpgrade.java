import java.util.Scanner;
import java.util.TreeMap;

public class p19PhonebookUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, String> phonebook = new TreeMap<>();

        String input = "";

        while (!((input = scanner.nextLine()).equals("END"))) {
            String[] currentCommand = input.split(" ");


            if (currentCommand[0].equals("A")) {
                String name = currentCommand[1];

                String phoneNumber = currentCommand[2];

                phonebook.put(name, phoneNumber);
            } else if (currentCommand[0].equals("S")) {
                String name = currentCommand[1];

                if (phonebook.containsKey(name)) {
                    System.out.println(name + " -> " + phonebook.get(name));
                } else {
                    System.out.println("Contact " + name + " does not exist.");
                }
            } else if (currentCommand[0].equals("ListAll")) {
                phonebook.forEach((key, value) -> {
                    System.out.println(key + " -> " + value);
                });
            }
        }
    }
}
