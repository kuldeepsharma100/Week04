package collectionframework.queueinterface.circularqueue;

import java.util.LinkedList;
import java.util.Queue;

public class CircularQueue {
    private Queue<Integer> queue;
    private int capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new LinkedList<>();
    }

    // Insert an element (remove oldest if full)
    public void insert(int value) {
        if (queue.size() == capacity) {
            queue.poll(); // Remove the oldest element
        }
        queue.offer(value); // Add new element
    }

    // Display buffer contents
    public void display() {
        System.out.println("Buffer: " + queue);
    }

}
