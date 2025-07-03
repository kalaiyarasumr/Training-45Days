package demo;

import java.util.Scanner;
public class RecursiveFactorial {
	public static long Factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return n*Factorial(n-1);
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Number: ");
			int n = sc.nextInt();
			long result = Factorial(n);
			System.out.println(result+" ");
		}
	}

}
