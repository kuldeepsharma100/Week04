package collectionframework.listinterface.elementfromend;

import java.util.Arrays;
import java.util.LinkedList;

public class ElementFromEndMain {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,45,5));
        System.out.println(ElementFromEnd.findNthElement(list, 3));
    }
}
