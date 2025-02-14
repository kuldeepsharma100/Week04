package collectionframework.mapinterface.keywithhightestvalue;

import java.util.Map;

public class MaxValue {

    public static String findMaxKey(Map<String, Integer> map) {
        if (map.isEmpty()) {
            return null; // Return null if the map is empty
        }

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }

}
