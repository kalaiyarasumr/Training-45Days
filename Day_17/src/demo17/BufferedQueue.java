package demo17;
import java.util.Queue;
import java.util.LinkedList;

class BufferedQueue {
    private Queue<Integer> buffer = new LinkedList<>();
    private int capacity = 5;

    public synchronized void produce(int item) throws InterruptedException {
        while (buffer.size() == capacity) {
            wait(); 
        }
        buffer.add(item);
        System.out.println("Produced: " + item);
        notify(); 
    }

    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait(); 
        }
        int item = buffer.remove();
        System.out.println("Consumed: " + item);
        notify(); 
        return item;
        
    }



    public static void main(String[] args) {
        BufferedQueue buffer = new BufferedQueue();

        Thread producer = new Thread(new Runnable() {
            public void run() {
                try {
                    for (int i = 0; i < 10; i++) {
                        buffer.produce(i);
                        Thread.sleep(2000); 
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Producer");

        Thread consumer = new Thread(new Runnable() {
            public void run() {
                try {
                    for (int i = 0; i < 10; i++) {
                        buffer.consume();
                        Thread.sleep(3000); 
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Consumer");

        producer.start();
        consumer.start();
    }
}