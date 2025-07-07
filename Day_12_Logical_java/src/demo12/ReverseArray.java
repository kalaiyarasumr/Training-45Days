package demo12;

import java.util.Scanner;
public class ReverseArray {
	public static int[] array(int[] num,int n) {
		int[] reverse = new int[n];
		for(int i=0;i<n;i++) {
			reverse[i] = num[n-1-i];
		}
		return reverse;
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for(int i=0;i<n;i++) {
			num[i] = sc.nextInt();
		}
		
		int[] reversed = array(num,n);
		for(int i=0;i<n;i++) {
			System.out.print(reversed[i]+" ");
		}
	}

}
