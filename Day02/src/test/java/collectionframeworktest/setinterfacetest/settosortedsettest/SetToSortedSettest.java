package collectionframeworktest.setinterfacetest.settosortedsettest;

import collectionframework.setinterface.settosortedset.SetToSortedSet;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class SetToSortedSettest {
    @Test
    public void test(){
        HashSet<Integer> set = new HashSet<>(Arrays.asList(1,2,8,3,7,0,10));

        TreeSet<Integer> expected = new TreeSet<>(Arrays.asList(0,1,2,3,7,8,10));

        TreeSet<Integer> treeSet = SetToSortedSet.sortedSet(set);
        Assert.assertEquals(expected, treeSet);
        System.out.println("Test passed");
    }
}
