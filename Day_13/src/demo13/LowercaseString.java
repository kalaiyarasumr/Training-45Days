package demo13;

import java.util.Scanner;

public class LowercaseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nc =" ";
		String s = sc.nextLine();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(Character.isLowerCase(c)) {
				System.out.print(c);
			}
		}
	}

}
