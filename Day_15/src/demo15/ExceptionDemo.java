package demo15;

import java.io.*;

public class ExceptionDemo {
	public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);

            int[] arr = {1, 2, 3};
            System.out.println("Element at index 5: " + arr[5]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index Out Of Bounds Exception caught: " + e.getMessage());
        }
        System.out.println("Program continues after exception handling...");
    }
}
