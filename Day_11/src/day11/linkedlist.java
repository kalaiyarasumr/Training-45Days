package day11;

import java.util.LinkedList;
import java.util.Queue;

public class linkedlist {

    public static Queue<Integer> createQueue() {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        return q;
    }

    public static void removeElement(Queue<Integer> q) {
        if (!q.isEmpty()) {
            int removed = q.remove();
            System.out.println(removed + " is removed from the LinkedList");
        } else {
            System.out.println("Queue is empty. Nothing to remove.");
        }
    }

    public static void peekElement(Queue<Integer> q) {
        if (!q.isEmpty()) {
            int front = q.peek();
            System.out.println("Front element: " + front);
        } else {
            System.out.println("Queue is empty. No front element.");
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = createQueue();
        System.out.println("Initial Queue: " + queue);

        removeElement(queue);
        System.out.println("Queue after removal: " + queue);

        peekElement(queue);
    }
}
