package primeornot;

import java.util.Scanner;

public class Sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        int original = num;

        while (num != 0) {
            sum += num % 10; 
            num /= 10;
        }

        System.out.println("Sum of digits of " + original + " is " + sum);
    }
}
