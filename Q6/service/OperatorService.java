// File: service/OperatorService.java
package Q6.service;
import Q6.adtInterface.Queue;
import java.util.LinkedList;

public class OperatorService<T> implements Queue<T> {
    private LinkedList<T> queue;

    public OperatorService() {
        queue = new LinkedList<>();
    }

    @Override
    public void enqueue(T item) {
        queue.add(item);
        System.out.println("Added ticket for customer: " + item);
    }

    @Override
    public T dequeue() {
        if (queue.isEmpty()) {
            System.out.println("No customers in the queue.");
            return null;
        }
        T removedItem = queue.remove();
        System.out.println("Processed ticket for customer: " + removedItem);
        return removedItem;
    }
}
