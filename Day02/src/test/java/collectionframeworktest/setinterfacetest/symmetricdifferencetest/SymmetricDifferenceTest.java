package collectionframeworktest.setinterfacetest.symmetricdifferencetest;

import collectionframework.setinterface.symmetricdifference.SymmetricDifference;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

public class SymmetricDifferenceTest {
    @Test
    public void test(){
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(1,2,3,7));

        HashSet<Integer> expected = new HashSet<>(Arrays.asList(2,7));

        HashSet<Integer> result = SymmetricDifference.symmetricDifference(set1, set2);

        Assert.assertEquals(expected, result);
        System.out.println("Test passed");


    }
}
