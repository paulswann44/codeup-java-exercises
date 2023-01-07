import java.util.Arrays;
import java.util.Random;


public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjectives = {"Beautiful", "Smart", "Strong", "Tall", "Happy", "Excited", "Brave", "Good", "Warm", "Bright"};
        String[] nouns = {"Dog", "Car", "House", "Tree", "Computer", "Phone", "Book", "Pen", "Table", "Cup"};

        String adjective = RandomWords(adjectives);
        String noun = RandomWords(nouns);
        System.out.printf("Here is your server name: %s-%s%n",adjective, noun);

    }

    public static String RandomWords(String[] array) {
        Random random = new Random();
        int index = random.nextInt(array.length);
        return array[index];
    }
}
