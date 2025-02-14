package collectionframework.queueinterface.stackusingqueue;

public class StackUsingQueueMain {
    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Pop: " + stack.pop());
        System.out.println("Top: " + stack.top());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Is Empty: " + stack.isEmpty());
    }
}
