package demo;

import java.util.*;
import java.util.Scanner;

public class StringMessage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Message : ");
		String message = sc.nextLine();
		System.out.println(message+" ");
		System.out.println(message.length());
		System.out.print(message.charAt(0));
		
		for(char result : message.toCharArray()) {
			System.out.println(result+" ");
		}
	}
	

}
