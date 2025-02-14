package collectionframework.queueinterface.reversequeue;

import java.util.ArrayDeque;
import java.util.Arrays;

public class ReverseQueueMain {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>(Arrays.asList(1,2,3,5,7,4,5));
        ArrayDeque<Integer> reversed = ReverseQueue.reverseQueue(queue);
        System.out.println(reversed);
    }
}
