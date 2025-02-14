package collectionframework.mapinterface.mergemaps;

import java.util.HashMap;
import java.util.Map;

public class MergeMapMain {
    public static void main(String[] args) {
        // create maps
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1); //add elements in map
        map1.put("B", 2);
        System.out.println("Map 1: " + map1);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);
        System.out.println("Map 2: " + map2);
        //method call to merge two maps
        Map<String, Integer> mergedMap = MergeMaps.mergeMaps(map1, map2);
        System.out.println("Merged Map: " + mergedMap);
    }
}
