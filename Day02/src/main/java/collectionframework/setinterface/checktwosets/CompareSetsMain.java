package collectionframework.setinterface.checktwosets;

import java.util.Arrays;
import java.util.HashSet;

public class CompareSetsMain {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,3,2));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(1,2,3));

        boolean result = CheckTwoSetEquality.compareSets(set1, set2);
        System.out.println(result);
    }
}
