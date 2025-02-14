package collectionframework.queueinterface.stackusingqueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    // Push operation
    public void push(int x) {
        queue1.add(x);
    }

    // Pop operation
    public int pop() {
        if (queue1.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }

        // Move elements except last to queue2
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }

        // Remove last element (stack top)
        int removed = queue1.poll();

        // Swap queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return removed;
    }

    // Top operation
    public int top() {
        if (queue1.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }

        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }

        int topElement = queue1.peek(); // Get last element
        queue2.add(queue1.poll()); // Move last element to queue2

        // Swap queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return topElement;
    }

    public boolean isEmpty() {
        return queue1.isEmpty();
    }

}
