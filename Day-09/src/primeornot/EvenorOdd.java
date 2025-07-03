package primeornot;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num % 2==0) {
			System.out.println(num+"is an Even Number");
		}
		else {
			System.out.println(num+"is Odd Number");
		}

	}

}
