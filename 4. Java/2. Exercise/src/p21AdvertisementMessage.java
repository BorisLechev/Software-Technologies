import java.util.Random;
import java.util.Scanner;

public class p21AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());

        String[] phrases = new String[]{"Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can't live without this product."};

        String[] events = new String[]{"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"};

        String[] author = new String[]{"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = new String[]{"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random random = new Random();

        for (int i = 0; i < numberOfLines; i++) {
            int randomPhrases = random.nextInt(4);
            System.out.printf(phrases[randomPhrases] + " ");

            int randomEvents = random.nextInt(4);
            System.out.printf(events[randomEvents] + " ");

            int randomAuthor = random.nextInt(4);
            System.out.printf(author[randomAuthor] + " ");

            int randomCities = random.nextInt(4);
            System.out.printf(cities[randomCities] + " ");
        }
    }
}
