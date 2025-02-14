package collectionframework.listinterface.reverselist;

import java.util.ArrayList;
import java.util.LinkedList;

public class ReverseListMain {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        System.out.println(ReverseList.reverseList(list));

        LinkedList<Integer> link = new LinkedList<>();
        link.add(1);
        link.add(2);
        link.add(3);
        System.out.println(link);
        System.out.println(ReverseList.reverseList(link));
    }
}
