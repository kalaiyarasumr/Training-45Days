package demo18;

import java.util.*;
public class Stringsplit {

	public static void main(String[] args) {
		String str = "apple,banana;orange:grape";
		String[] s = str.split("[,;:]");
		for(String fruits :s) {
			System.out.println(fruits);
		}
	}
	

}
