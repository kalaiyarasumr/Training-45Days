package day11;

public class rightsideStart {

	    public static void main(String[] args) {
	        int rows = 5;

	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= i; k++) {
	                System.out.print("*");
	            }
	            System.out.println(); 
	        }
	    }
	}


