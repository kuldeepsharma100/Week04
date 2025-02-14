package collectionframework.setinterface.subset;

import java.util.Arrays;
import java.util.HashSet;

public class SubsetMain {
    public static void main(String[] args) {
        HashSet<Integer> subSet = new HashSet<>(Arrays.asList(1,3,2));
        HashSet<Integer> set = new HashSet<>(Arrays.asList(1,3, 9,3,0,3,2));
        System.out.println(SubSet.findSubset(subSet, set));
    }
}
