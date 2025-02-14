package collectionframeworktest.listinterfacetest.removeduplicatetest;

import collectionframework.listinterface.removeduplicate.RemoveDuplicate;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateTest {
    @Test
    public void test1(){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,1,3,7,7,4,4));
        LinkedHashSet<Integer> actual = RemoveDuplicate.removeDuplicates(list);
        LinkedHashSet<Integer> expected = new LinkedHashSet<>(Arrays.asList(1,2,3,7,4));

        Assert.assertEquals(expected, actual);
        System.out.println("test passed");
    }
}
