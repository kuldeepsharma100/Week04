package collectionframework.listinterface.rotatelist;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateListMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        System.out.println(RotateList.rotateList(list, 2));
    }
}
