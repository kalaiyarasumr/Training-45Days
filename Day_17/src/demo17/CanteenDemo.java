package demo17;

import java.util.*;

public class CanteenDemo {
    private final Queue<String> counter = new LinkedList<>();
    private final int capacity = 5;

    public synchronized void produce(String foodItem) throws InterruptedException {
        while (counter.size() == capacity) {
            wait();
        }
        counter.add(foodItem);
        System.out.println("Chef prepared: " + foodItem);
        notifyAll();
    }

    public synchronized void consume() throws InterruptedException {
        while (counter.isEmpty()) {
            wait();
        }
        String foodItem = counter.poll();
        System.out.println("Student picked up: " + foodItem);
        notifyAll();
    }
    
    public static void main(String[] args) {
        CanteenDemo canteen = new CanteenDemo();
        String[] foodMenu = {
            "Idli", "Dosa", "Burger", "Pizza", "Pasta",
            "Sandwich", "Biryani", "Samosa", "Vada", "Chole Bhature","India","Mugesh Mythra"
        };

        Thread chef = new Thread(() -> {
            for (String food : foodMenu) {
                try {
                    canteen.produce(food);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread student = new Thread(() -> {
            for (int i = 0; i < foodMenu.length; i++) {
                try {
                    canteen.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        chef.start();
        student.start();

        try {
            chef.join();
            student.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Canteen closed.");
    }
}