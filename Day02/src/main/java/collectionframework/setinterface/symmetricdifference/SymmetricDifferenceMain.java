package collectionframework.setinterface.symmetricdifference;

import java.util.Arrays;
import java.util.HashSet;

public class SymmetricDifferenceMain {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(1,2,3,7));

        HashSet<Integer> result = SymmetricDifference.symmetricDifference(set1, set2);
        System.out.println(result);
    }
}
