package demo;

import java.util.Scanner;

public class PimeArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many prime numbers to display: ");
        int n = sc.nextInt(); 
        int[] primes = new int[n];

        int count = 0;
        int num = 2;

        while (count < n) {
            if (isPrime(num)) {
                primes[count] = num;
                count++;
            }
            num++;
        }

        System.out.println("First " + n + " prime numbers:");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }

        sc.close(); 
    }

    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }

        return true;
    }
}
