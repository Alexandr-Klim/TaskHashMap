import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TaskFor {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("яблоко");
        list.add("апельсин");
        list.add("яблоко");
        list.add("банан");
        list.add("апельсин");
        list.add("яблоко");

        Map<String, Integer> map = new HashMap<>();
        for (String name : list) {
            if (!map.containsKey(name)) {
                map.put(name, 1);
            } else {
                map.put(name, map.get(name) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
