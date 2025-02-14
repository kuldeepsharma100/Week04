package collectionframework.listinterface.removeduplicate;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicate {
    public static LinkedHashSet<Integer> removeDuplicates(ArrayList<Integer> list){
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        int n = list.size() , i = 0;
        while(i<n){
            linkedHashSet.add(list.get(i));
            i++;
        }
        return linkedHashSet;
    }
}
