package day11;

import java.util.Scanner;

public class PatterCharacter {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			for(int i =1;i<=n;i++) {
				for(char ch = 'A';ch<'A'+i;ch++) {
					System.out.print(ch);
				}
				System.out.println();
			}
		}
	}

}
