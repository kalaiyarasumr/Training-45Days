package primeornot;

public class JaggedArray {

	public static void main(String[] args) {
		int[][] jdArray = new int[3][];
		jdArray[0] = new int[] {1,2};
		jdArray[1] = new int[] {3,4,5};
		jdArray[2] = new int[] {6,7,8,9};
		for(int i=0;i<jdArray.length;i++) {
			for(int j=0;j<jdArray[i].length;j++) {
				System.out.print(jdArray[i][j] + " ");
			}
			System.out.println();
		}

	}
	
}
