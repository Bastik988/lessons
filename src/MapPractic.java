import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPractic {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(23, "Здравствуй");
        map.put(32, "Hi");
        System.out.println(map.get(23));
        Set<Integer> keys = map.keySet();
        System.out.println(keys);
        Collection<String> collections = map.values();
        System.out.println(collections);
        map.replace(32, "Hello");
        map.remove(23);
        System.out.println(map);
    }
}
