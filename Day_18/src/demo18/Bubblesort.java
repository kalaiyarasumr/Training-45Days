package demo18;

import java.util.Scanner;
public class Bubblesort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1] ) {
					int temp = arr[j];
					arr[j] =arr[j+1];
					arr[j+1] =temp;
				}
			}
		}
		for(int num : arr) {
			System.out.print(num+" ");
		}
	}

}
