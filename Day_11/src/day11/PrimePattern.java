package day11;

public class PrimePattern {

    public static void main(String[] args) {
        int rows = 4;
        int num = 2;  

        for (int i = 1; i <= rows; i++) {
            int count = 0;
            num = 2; 

            while (count < i) {
                if (isPrime(num)) {
                    System.out.print(num + " ");
                    count++;
                }
                num++;
            }
            System.out.println();
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
