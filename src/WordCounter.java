import java.util.Arrays;

public class WordCounter {
    public static int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        input = input.replaceAll("\\d", "");
        input = input.replaceAll("[.,;\-\[\](){}]", " ");
        String[] words = input.split("\\s+");
        return (int) Arrays.stream(words)
                .filter(word -> word.length() >= 3)
                .count();
    }
}
