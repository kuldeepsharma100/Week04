package collectionframework.listinterface.reverselist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {
    public static  List<Integer> reverseList(List<Integer> list){

        if(list instanceof ArrayList<Integer>){
            int end = list.size()-1;
            ArrayList<Integer> temp = new ArrayList<>();
            while(end>=0) {
                temp.add(list.get(end));
                end--;
            }
            return temp;
        }else{
            LinkedList<Integer> temp = new LinkedList<>();
            int n = list.size();
            int start = 0;
            while(start<n){
                temp.addFirst(list.get(start));
                start++;
            }
            return temp;
        }

    }
}
