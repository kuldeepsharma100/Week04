package collectionframeworktest.listinterfacetest.elementfromend;

import collectionframework.listinterface.elementfromend.ElementFromEnd;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class ElementFromEndTest {
    @Test
    public void test(){
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,45,5));
        Assert.assertEquals(3, ElementFromEnd.findNthElement(list,3));
        System.out.println("Test passed");
    }
}
