package demo12;

import java.util.Scanner;

public class ArmStrongPatter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;   
        int printed = 0;   
        int num = 1;        

        while (printed < n) {
            count++; 
            int rowPrinted = 0;

            while (rowPrinted < count && printed < n) {
                int originalNum = num;
                int temp = num;
                int digits = 0;

                while (temp != 0) {
                    digits++;
                    temp /= 10;
                }

                temp = num;
                int sum = 0;
                while (temp != 0) {
                    int rem = temp % 10;
                    sum += Math.pow(rem, digits);
                    temp /= 10;
                }

                if (sum == originalNum) {
                    System.out.print(num + " ");
                    rowPrinted++;
                    printed++;
                }

                num++;
            }
            System.out.println();
        }

    }
}
