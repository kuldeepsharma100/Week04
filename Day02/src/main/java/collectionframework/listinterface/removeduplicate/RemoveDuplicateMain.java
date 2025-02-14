package collectionframework.listinterface.removeduplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,1,3,7,7,4,4));
        LinkedHashSet <Integer> has = RemoveDuplicate.removeDuplicates(list);
        System.out.println(has);
    }
}
