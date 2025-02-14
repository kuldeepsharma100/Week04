package collectionframeworktest.setinterfacetest.subsettest;

import collectionframework.setinterface.subset.SubSet;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

public class SubsetTest {
    @Test
    public void test(){
        HashSet<Integer> subSet = new HashSet<>(Arrays.asList(1,3,2));
        HashSet<Integer> set = new HashSet<>(Arrays.asList(1,3, 9,3,0,3,2));
        boolean result = SubSet.findSubset(subSet, set);
        Assert.assertEquals(true,result);
        System.out.println("Test passed!");
    }
}
