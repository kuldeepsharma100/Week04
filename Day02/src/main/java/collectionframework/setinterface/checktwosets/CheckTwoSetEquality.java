package collectionframework.setinterface.checktwosets;

import java.util.HashSet;

public class CheckTwoSetEquality {
    public static boolean compareSets(HashSet<Integer> set1, HashSet<Integer> set2){
        if(set1.size() !=set2.size()){
            return false;
        }
        for(Integer n : set1){
            if(set1.contains(n) != set2.contains(n)){
                return false;
            }
        }
        return set1.size() == set2.size();
    }
}
