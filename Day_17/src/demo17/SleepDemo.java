package demo17;


class SleepDemo extends Thread {
    public void run() {
        System.out.println("Thread name: " + Thread.currentThread().getName());
        try {
            System.out.println("Going to sleep...");
            Thread.sleep(2000); // 2-second sleep
            System.out.println("Woke up!");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SleepDemo t1 = new SleepDemo();
        t1.setName("MySleepThread");
        t1.start();
    }
}


