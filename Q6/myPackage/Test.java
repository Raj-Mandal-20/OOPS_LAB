// File: myPackage/Test.java
package Q6.myPackage;
import Q6.adtInterface.Queue;
import Q6.service.OperatorService;

public class Test {
    public static void main(String[] args) {
        Queue<Integer> ticketQueue = new OperatorService<>();
        
        // Enqueue customers for tickets
        ticketQueue.enqueue(101);
        ticketQueue.enqueue(102);
        ticketQueue.enqueue(103);
        
        // Process customers (dequeue)
        ticketQueue.dequeue();
        ticketQueue.dequeue();
        ticketQueue.dequeue();
        ticketQueue.dequeue(); // Trying to dequeue an empty queue
        
        // Enqueue new customers after processing
        ticketQueue.enqueue(104);
        ticketQueue.enqueue(105);
        ticketQueue.dequeue();
    }
}
