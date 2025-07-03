package demo;

import java.util.*;

public class CalculateArea {

    public static int rectangleCalculate(int l, int b) {
        return l * b;
    }

    public static int squareCalculate(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the shape : ");
        String shape = sc.next().toLowerCase();  

        switch (shape) {
            case "rectangle":
                System.out.print("Enter the Length: ");
                int l = sc.nextInt();
                System.out.print("Enter the Breadth: ");
                int b = sc.nextInt();
                int rectArea = rectangleCalculate(l, b);
                System.out.println("Area of the Rectangle is: " + rectArea);
                break;

            case "square":
                System.out.print("Enter the Side: ");
                int side = sc.nextInt();
                int squareArea = squareCalculate(side);
                System.out.println("Area of the Square is: " + squareArea);
                break;

            default:
                System.out.println("Invalid shape entered");
        }

        sc.close();
    }
}
