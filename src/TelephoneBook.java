import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelephoneBook {

    private Map<String, List<String>> phoneBook;

    public TelephoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String name, String number) {
        phoneBook.putIfAbsent(name, new ArrayList<>());
        phoneBook.get(name).add(number);
    }

    public List<String> get(String name) {
        return phoneBook.getOrDefault(name, new ArrayList<>());
    }

    public static void main(String[] args) {
        TelephoneBook phoneBook = new TelephoneBook();

        phoneBook.add("Дима", "8-975-475-74-67");
        phoneBook.add("Маша", "8-900-334-34-55");
        phoneBook.add("Дима", "8-900-124-33-93");
        phoneBook.add("Саша", "8-976-674-89-12");

        System.out.println("Дима: " + phoneBook.get("Дима"));
        System.out.println("Маша: " + phoneBook.get("Маша"));
        System.out.println("Вика: " + phoneBook.get("Вика"));

    }
}
