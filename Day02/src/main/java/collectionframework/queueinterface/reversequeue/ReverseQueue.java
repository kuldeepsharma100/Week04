package collectionframework.queueinterface.reversequeue;

import java.util.ArrayDeque;

public class ReverseQueue {
        public static ArrayDeque<Integer> reverseQueue(ArrayDeque<Integer> queue){
            ArrayDeque<Integer> reversed = new ArrayDeque<>();
            for(Integer ele : queue){
                    reversed.addFirst(ele);
            }
            return reversed;

        }
}
