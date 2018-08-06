import java.util.LinkedHashMap;
import java.util.Scanner;

public class p07SumsByTown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, Double> towns = new LinkedHashMap<>();

        for (int i = 0; i < number; i++) {
            String[] array = scanner.nextLine().split(" \\| ");

            String town = array[0];
            double income = Double.parseDouble(array[1]);

            if (!towns.containsKey(town)){
                towns.putIfAbsent(town, income);
            }else{
                towns.put(town, towns.get(town) + income);
            }
        }

        towns.entrySet().stream().sorted((e1, e2) ->
        e1.getKey().compareTo(e2.getKey()))
                .forEach(e -> {
                    System.out.printf("%s  -> %.1f\n", e.getKey(), e.getValue());
                });
    }
}
