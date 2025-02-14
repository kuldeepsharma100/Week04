package collectionframework.setinterface.unionandintersection;

import java.util.Arrays;
import java.util.HashSet;

public class UnionAndIntersectionMain {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(1,2,3,7));

        HashSet<Integer> union = UnionAndIntersection.union(set1,set2);
        HashSet<Integer> intersection = UnionAndIntersection.intersection(set1, set2);

        System.out.println(union);
        System.out.println(intersection);
    }
}
