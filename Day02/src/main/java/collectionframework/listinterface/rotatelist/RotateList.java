package collectionframework.listinterface.rotatelist;

import java.util.ArrayList;

public class RotateList {
    public static ArrayList<Integer> rotateList(ArrayList<Integer> list, int k){
        int n = list.size();

        reverseList(list, 0, n-1);
        reverseList(list, 0, n-k-1);
        reverseList(list, n-k, n-1);

        return list;

    }

    public static  void reverseList(ArrayList<Integer> list, int start, int end){
        int i = start, j = end;
        while(i<j){
            int temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }
}
