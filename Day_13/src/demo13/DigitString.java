package demo13;

import java.util.Scanner;

public class DigitString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String nc =" ";
		int count =0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(Character.isDigit(ch)) {
				System.out.print(ch);
				count++;
				System.out.println(count);

				}
			}
			
		}
}
