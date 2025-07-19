package demo18;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class regex {

	public static void main(String[] args) {
		String str = "hello123";
		System.out.println(str.matches("[a-z]+"));
		String str2 = "12345";
		System.out.println(str2.matches("[0-9]+"));
		String str3 = "hello world";
		System.out.println(str3.matches("[a-z]+"));
		String str4 = "HelloWolrd";
		System.out.println(str4.matches("[a-zA-Z]+"));
		
		
	}

}
