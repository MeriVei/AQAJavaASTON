import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {

    private Map<String, String> map;

    public Phonebook() {
        map = new HashMap<>();
    }

    public void add(String name, String phone) {
        if (map.containsKey(phone)) {
            System.out.println("Такой номер уже существует");
        } else {
            map.put(phone, name);
        }
    }

    public List<String> get(String name) {
        List<String> phones = new ArrayList<>();
        for (Map.Entry<String, String> item : map.entrySet()) {
            if (item.getValue().equals(name)) {
                phones.add(item.getKey());
            }
        }
        return phones;
    }
}
