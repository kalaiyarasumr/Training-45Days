package day11;

public class ArrayReturn {

	    public static int[] getArray() {
	        int[] numbers = {10, 20, 30, 40, 50};
	        return numbers;
	    }

	    public static void main(String[] args) {
	        int[] result = getArray();

	        System.out.println("Array elements:");
	        for (int i = 0; i < result.length; i++) {
	            System.out.print(result[i]+" ");
	        }
	    }
	}

