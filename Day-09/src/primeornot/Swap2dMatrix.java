package primeornot;

import java.util.Scanner;

public class Swap2dMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int rows = 2, cols = 2;

        int[][] arr1 = new int[rows][cols];
        int[][] arr2 = new int[rows][cols];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println(arr1[i][j]);

        System.out.println("After Swap");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int temp = arr1[i][j];
                arr1[i][j] = arr2[i][j];
                arr2[i][j] = temp;
            }
        }
      
    }
}
