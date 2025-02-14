package collectionframework.mapinterface.mergemaps;

import java.util.HashMap;
import java.util.Map;

public class MergeMaps {
    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> mergedMap = new HashMap<>();

        // add all elements from map1
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            mergedMap.put(entry.getKey(), entry.getValue());
        }

        // add elements from map2
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            if (mergedMap.containsKey(key)) {
                mergedMap.put(key, mergedMap.get(key) + value); // Sum values
            } else {
                mergedMap.put(key, value);
            }
        }

        return mergedMap;
    }
}
