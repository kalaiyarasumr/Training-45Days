package demo17;

public class BankDemo {
	    private int balance = 1000;

	    public synchronized void deposit(double amount) {
	        balance += amount;
	        System.out.println(Thread.currentThread().getName() + " deposited ₹" + amount + ". Current balance: ₹" + balance);
	        notifyAll(); 
	    }
	    public synchronized void withdraw(int amount) {
	        while (balance < amount) {
	            System.out.println(Thread.currentThread().getName() + " wants to withdraw ₹" + amount + " but balance is low. Waiting...");
	            try {
	                wait(); 
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	        balance -= amount;
	        System.out.println(Thread.currentThread().getName() + " withdrew ₹" + amount + ". Remaining balance: ₹" + balance);
	    }

	    public int getBalance() {
	        return balance;
	    }
	

	    public static void main(String[] args) {
	        BankDemo account = new BankDemo();

	        Thread depositor = new Thread(() -> {
	            int[] deposits = {200, 500, 300, 700};
	            for (double amount : deposits) {
	                try {
	                    Thread.sleep(1000); 
	                    account.deposit(amount);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        }, "Depositor");

	        Thread withdrawer = new Thread(() -> {
	            int[] withdrawals = {400, 800, 300, 700};
	            for (double amount : withdrawals) {
	                try {
	                    Thread.sleep(1500); 
	                    account.withdraw(amount);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        }, "Withdrawer");

	        depositor.start();
	        withdrawer.start();

	        try {
	            depositor.join();
	            withdrawer.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Final balance: ₹" + account.getBalance());
	        System.out.println("Bank operations completed.");
	    }

		private double withdraw(double amount) {
			return (Double) amount;
			
		}
	}




