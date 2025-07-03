package primeornot;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int originalnum;
        int remainder;
        int result = 0;
        originalnum = num;

        while (originalnum != 0) {
            remainder = originalnum % 10;
            result += Math.pow(remainder, 3);
            originalnum /= 10;
        }

        if (result == num) {
            System.out.println(result + " is an Armstrong Number");
        } else {
            System.out.println(result + " is not an Armstrong Number");
        }

        sc.close();
    }
}
