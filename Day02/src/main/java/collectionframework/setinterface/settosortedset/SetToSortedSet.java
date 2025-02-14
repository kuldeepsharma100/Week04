package collectionframework.setinterface.settosortedset;

import java.util.HashSet;
import java.util.TreeSet;

public class SetToSortedSet {
    public static TreeSet<Integer> sortedSet(HashSet<Integer> set){
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(Integer ele : set){
            treeSet.add(ele);
        }
        return treeSet;
    }
}
