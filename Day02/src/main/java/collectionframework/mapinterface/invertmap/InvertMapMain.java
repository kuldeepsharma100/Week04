package collectionframework.mapinterface.invertmap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvertMapMain {
    public static void main(String[] args) {
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 1);

        System.out.println("Original Map: " + originalMap);
        Map<Integer, List<String>> invertedMap = InvertMap.invertMap(originalMap);
        System.out.println("Inverted Map: " + invertedMap);
    }

}
