package collectionframeworktest.queueinterface.reversequeue;

import collectionframework.queueinterface.reversequeue.ReverseQueue;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseQueueTest {
    @Test
    public void test(){
        ArrayDeque<Integer> queue = new ArrayDeque<>(Arrays.asList(1,2,3,4,5));
        ArrayDeque<Integer> reversed = ReverseQueue.reverseQueue(queue);
        ArrayDeque<Integer> expected = new ArrayDeque<>(Arrays.asList(5,4,3,2,1));
        assertEquals(new ArrayList<>(expected), new ArrayList<>(reversed));
        System.out.println("Test passed!");

    }
}
