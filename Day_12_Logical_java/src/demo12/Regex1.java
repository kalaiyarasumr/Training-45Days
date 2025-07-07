package demo12;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1= sc.next();
		String s2 =sc.next();
		System.out.print(Pattern.matches(s1.toLowerCase(),s2.toLowerCase()));
		
	}

}
