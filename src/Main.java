import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] mas = {"Hi", "Hello", "Cat", "Dog", "Cat",
                "Hi", "Hi", "Coat", "Sun", "Cat",
                "Sea", "Sun", "Door", "Hi", "Shirt"};
        Map<String, Integer> map = new HashMap<>();
        for (String str : mas) {
            if (map.containsKey(str)) {
                map.replace(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        System.out.println("Уникальные элементы массива:");
        for (Map.Entry<String, Integer> item : map.entrySet()) {
            if (item.getValue() == 1) {
                System.out.println(item.getKey());
            }
        }
        System.out.println("Слова и их количество в массиве:");
        for (Map.Entry<String, Integer> item : map.entrySet()) {
            System.out.println(item.getKey() + "  -  " + item.getValue());
        }

        Phonebook phonebook = new Phonebook();
        phonebook.add("Сидоров", "1234567");
        phonebook.add("Котиков", "6785343");
        phonebook.add("Супчиков", "7863451");
        phonebook.add("Булочкин", "3456512");
        phonebook.add("Компотиков", "9535423");
        phonebook.add("Петров", "9571234");
        phonebook.add("Булочкин", "7125432");
        System.out.println();
        System.out.println(Arrays.toString(phonebook.get("Булочкин").toArray()));
    }
}