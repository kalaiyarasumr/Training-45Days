package demo17;

class Multiple implements Runnable {
    private String taskName;

    public Multiple(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " - " + Thread.currentThread().getName() +
                               " (Priority: " + Thread.currentThread().getPriority() + ") - i: " + i);
            
        }
    }

    public static void main(String[] args) {
        Multiple task1 = new Multiple("Task-A");
        Multiple task2 = new Multiple("Task-B");
        Multiple task3 = new Multiple("Task-C");

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task3);

        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        t1.setPriority(Thread.MIN_PRIORITY);   
        t2.setPriority(Thread.NORM_PRIORITY); 
        t3.setPriority(Thread.MAX_PRIORITY);   

        t1.start();
        t2.start();
        t3.start();
    }
}



