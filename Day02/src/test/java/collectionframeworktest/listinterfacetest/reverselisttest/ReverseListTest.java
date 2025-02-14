package collectionframeworktest.listinterfacetest.reverselisttest;

import collectionframework.listinterface.reverselist.ReverseList;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ReverseListTest {
    @Test
    public void test1(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Assert.assertEquals( Arrays.asList(3,2,1), ReverseList.reverseList(list));
        System.out.println("Test passed!");
    }

    @Test
    public void test2(){
        LinkedList<Integer> link = new LinkedList<>();
        link.add(1);
        link.add(2);
        link.add(3);
        Assert.assertEquals(Arrays.asList(3,2,1), ReverseList.reverseList(link));
        System.out.println("test Passed!");
    }
}
