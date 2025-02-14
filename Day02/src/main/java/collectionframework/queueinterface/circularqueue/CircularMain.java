package collectionframework.queueinterface.circularqueue;

public class CircularMain {
    public static void main(String[] args) {
        CircularQueue cb = new CircularQueue(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.display();

        cb.insert(4); // Removes 1, adds 4
        cb.display(); // Output: Buffer: [2, 3, 4]

        cb.insert(5);
        cb.display();
    }

}
