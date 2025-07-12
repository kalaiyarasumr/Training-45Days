package demo17;


class SleepDemojoin extends Thread {

    public void run() {
        System.out.println("Thread name: " + Thread.currentThread().getName());
        try {
            System.out.println(Thread.currentThread().getName() + " going to sleep...");
            Thread.sleep(2000); 
            System.out.println(Thread.currentThread().getName() + " woke up!");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SleepDemojoin t1 = new SleepDemojoin();
        t1.setName("Thread-1");

        SleepDemojoin t2 = new SleepDemojoin();
        t2.setName("Thread-2");

        t1.start();  

        try {
            t1.join();  
        } catch (InterruptedException e) {
            System.out.println("Main interrupted during join: " + e.getMessage());
        }

        t2.start();  

        try {
            t2.join();  
        } catch (InterruptedException e) {
            System.out.println("Main interrupted during join: " + e.getMessage());
        }

        System.out.println("Main method finished");
    }
}