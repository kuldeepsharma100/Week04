package collectionframework.listinterface.elementfromend;

import java.util.Collections;
import java.util.LinkedList;

public class ElementFromEnd {
    public static int findNthElement(LinkedList<Integer> list, int n){
        Collections.reverse(list);

         return list.get(n-1);

    }
}
