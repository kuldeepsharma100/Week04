package collectionframework.setinterface.subset;

import java.util.HashSet;

public class SubSet {
    public static boolean findSubset(HashSet<Integer> subSet, HashSet<Integer> set){
        for(Integer ele : subSet){
            if(!set.contains(ele)){
                return false;
            }
        }
        return true;
    }
}
