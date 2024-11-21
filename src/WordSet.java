import java.util.*;

public class WordSet {
    public static void main(String[] args) {

        ArrayList<String> countries = new ArrayList<>(Arrays.asList("Австралия", "Греция", "Дания", "Россия", "Франция",
                "Вьетнам", "Италия", "Греция", "Япония", "Кения", "Франция", "Дания", "Греция"));

        System.out.println("Изначальный список: " + countries);

        HashSet<String> uniqueWords = new HashSet<>();

        for (String word : countries) {
            uniqueWords.add(word);
        }

        System.out.println("Уникальные слова: " + uniqueWords);

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : countries) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Количество повторений: ");

        for (String word : wordCount.keySet()) {
            System.out.println(word + " — " + wordCount.get(word));
        }
    }
}
