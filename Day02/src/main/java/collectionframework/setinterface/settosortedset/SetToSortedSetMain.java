package collectionframework.setinterface.settosortedset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class SetToSortedSetMain {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(Arrays.asList(1,2,8,3,7));

        TreeSet<Integer> treeSet = SetToSortedSet.sortedSet(set);
        System.out.println(treeSet);
    }
}
