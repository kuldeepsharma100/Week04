package collectionframeworktest.setinterfacetest.unionandintersectiontest;

import collectionframework.setinterface.unionandintersection.UnionAndIntersection;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

public class UnionAndIntersectionTest {
    @Test
    public void test(){
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(1,2,3,7));

        HashSet<Integer> union = UnionAndIntersection.union(set1,set2);
        HashSet<Integer> intersection = UnionAndIntersection.intersection(set1, set2);

        Assert.assertEquals(set1, intersection);
        System.out.println("test passed for intersection");
        Assert.assertEquals(set2, union);
        System.out.println("test passed for union");
    }
}
