package demo17;

class MyRunnable implements Runnable {

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " value of i: " + i);
        }
    }

    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();

        Thread t1 = new Thread(runnable);
        t1.setName("Thread-1");

       
        t1.start();
    }
}



