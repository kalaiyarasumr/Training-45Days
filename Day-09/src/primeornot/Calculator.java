package primeornot;

import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("First Number : ");
		double num1 = sc.nextDouble();
		System.out.print("Choose Operator - +,-,*,/ : " );
		char operator = sc.next().charAt(0);
		System.out.print("Second Number : ");
		double num2 = sc.nextDouble();
		double result = 0;
		switch(operator) {
		  case '+' :
			  result = num1+num2;
			  break;
		  case '-' :
			  result = num1-num2;
			  break;
		  case '*' :
			  result = num1*num2;
			  break;
		  case '/' :
			  if(num2 != 0) {
				  result = num1 / num2;
				  
			  }
			  else{
				  System.out.print("Error : cannot divided by zero");
				  sc.close();
				  return;
			  }
			  break;
			  default :
				  System.out.print("Invalid Operator");
				  return;
		}
		System.out.println("Result : "+result);
	}
}
