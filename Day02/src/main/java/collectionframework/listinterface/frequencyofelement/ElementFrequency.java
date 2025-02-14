package collectionframework.listinterface.frequencyofelement;

import java.util.HashMap;

public class ElementFrequency {
    public  static  HashMap<String, Integer> findFrequency(String [] str){
        int length = str.length;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i =0; i<length; i++){
            if(map.containsKey(str[i])){
                map.put(str[i], map.get(str[i])+1);
            }else{
                map.put(str[i], 1);
            }
        }

        return map;
    }
}
