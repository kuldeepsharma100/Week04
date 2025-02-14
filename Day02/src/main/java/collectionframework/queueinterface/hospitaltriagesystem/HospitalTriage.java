package collectionframework.queueinterface.hospitaltriagesystem;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HospitalTriage {
    public static void main(String[] args) {
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>(
                Comparator.comparingInt(p -> -p.severity)
        );

        // Adding patients to the queue
        triageQueue.add(new Patient("John", 3));
        triageQueue.add(new Patient("Alice", 5));
        triageQueue.add(new Patient("Bob", 2));

        // Processing patients in order of severity
        System.out.println("Order of treatment:");
        while (!triageQueue.isEmpty()) {
            System.out.println(triageQueue.poll());
        }
    }
}

