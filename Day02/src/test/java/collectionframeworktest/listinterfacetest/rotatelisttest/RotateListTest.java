package collectionframeworktest.listinterfacetest.rotatelisttest;

import collectionframework.listinterface.rotatelist.RotateList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateListTest {
    @Test
    public void test1(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Assert.assertEquals(Arrays.asList(30, 40, 50,10,20), RotateList.rotateList(list,2));
        System.out.println("Test passed!");
    }
}
