package collectionframework.mapinterface.keywithhightestvalue;

import java.util.HashMap;
import java.util.Map;

public class MaxValueMain {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        System.out.println("Input Map: " + map);
        String maxKey = MaxValue.findMaxKey(map);
        System.out.println("Key with the highest value: " + maxKey);
    }

}
