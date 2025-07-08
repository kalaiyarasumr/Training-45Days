package demo13;

import java.util.Scanner;
public class Ascii_Values {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String msg = sc.nextLine();
			for(int i=0;i<msg.length();i++) {
				char ch = msg.charAt(i);
				int ascii = (int)ch;
				System.out.println(ch+ ":" + ascii);
			}
			
		}

	}

}
