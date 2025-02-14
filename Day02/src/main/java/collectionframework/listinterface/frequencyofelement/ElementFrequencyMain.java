package collectionframework.listinterface.frequencyofelement;

import java.util.HashMap;

public class ElementFrequencyMain {
    public static void main(String[] args) {
        String [] arr =  {"apple", "banana" , "apple", "orange"};

        HashMap<String , Integer> map = ElementFrequency.findFrequency(arr);

        for(String key : map.keySet()){
            System.out.println(key + " : "+ map.get(key));
        }
    }
}
