package collectionframework.setinterface.unionandintersection;

import java.util.HashSet;

public class UnionAndIntersection {
    public static HashSet<Integer> union(HashSet<Integer> set1 , HashSet<Integer> set2){
        HashSet<Integer> res = new HashSet<>();
        for(Integer ele : set1){
            res.add(ele);
        }
        for(Integer ele : set2){
            res.add(ele);
        }

        return res;
    }

    public static HashSet<Integer> intersection(HashSet<Integer> set1 , HashSet<Integer> set2){
        HashSet<Integer> res = new HashSet<>();
        for(Integer ele : set1){
            if(set2.contains(ele)){
                res.add(ele);
            }
        }


        return res;
    }
}
