package collectionframeworktest.listinterfacetest.elementfrequencytest;

import collectionframework.listinterface.frequencyofelement.ElementFrequency;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class ElementFrequencyTest {
    @Test
    public void test1(){
        String [] arr =  {"apple", "banana" , "apple", "orange"};

        HashMap<String , Integer> map = ElementFrequency.findFrequency(arr);

        int result = map.get("apple");

        Assert.assertEquals(2, result);
        System.out.println("Test passed!");
    }
}
