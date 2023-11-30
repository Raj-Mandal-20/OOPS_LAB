class SharedResource {
    private int x;
    private boolean canProduce;

    public SharedResource() {
        this.x = 0;
        this.canProduce = true;
    }

    public synchronized int consume() {
        while (!canProduce) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        canProduce = false;
        notify();
        return x;
    }

    public synchronized void produce() {
        while (canProduce) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        x++;
        System.out.println("Produced: " + x);
        canProduce = true;
        notify();
    }
}

class Producer extends Thread {
    private SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        while (true) {
            sharedResource.produce();
        }
    }
}

class Consumer extends Thread {
    private SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        while (true) {
            int value = sharedResource.consume();
            System.out.println("Consumed: " + value);
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Producer producer = new Producer(sharedResource);
        Consumer consumer = new Consumer(sharedResource);

        producer.start();
        consumer.start();
    }
}
