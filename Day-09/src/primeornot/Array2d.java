package primeornot;

public class Array2d {

    public static void main(String[] args) {
    
        int rows = 3;
        int cols = 4;

        System.out.println("Matrix of indices (i, j):");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println(); 
        }
    }
}
