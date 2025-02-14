package collectionframeworktest.queueinterface.generatebinary;

import collectionframework.queueinterface.generatebinary.GenerateBinaryNumber;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateBinaryTest {
    @Test
    public void test(){
        List<String > result = GenerateBinaryNumber.generateBinaryNumbers(4);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("1", "10","11","100"));
        Assert.assertEquals(expected, result);
        System.out.println("test passed!");

    }
}
