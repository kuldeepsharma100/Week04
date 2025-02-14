package collectionframeworktest.setinterfacetest.comparehashsettest;

import collectionframework.setinterface.checktwosets.CheckTwoSetEquality;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

public class CompareHashSetTest {
    @Test
    public void test(){
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,3,2));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(1,2,3));

        boolean result = CheckTwoSetEquality.compareSets(set1, set2);
        Assert.assertEquals(true,result);
        System.out.println("Test passed");
    }
}
