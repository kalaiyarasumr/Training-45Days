package day11;

public class QueueArray {
    int front, rear, capacity;
    int[] arr;

    public QueueArray(int size) {
        capacity = size;
        front = 0;
        rear = -1;
        arr = new int[capacity];
    }

    public boolean enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return false;
        } else {
            rear++;
            arr[rear] = data;
            return true;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        } else {
            int value = arr[front];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return value;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        } else {
            return arr[front];
        }
    }

  
    public boolean isEmpty() {
        return rear < 0;
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.print("Queue: ");
            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        System.out.println("Dequeued: " + q.dequeue());
        q.display();

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.display();

        System.out.println("Peek: " + q.peek());
    }
}
