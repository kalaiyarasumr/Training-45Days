package demo12;

public class MethodOverload {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int add(double num1, double num2) {
        double result = num1 + num2;
        return (int) result;
    }

    public static void main(String[] args) {
        int sum1 = add(40, 20);
        int sum2 = add(20, 30, 40);
        int sum3 = add(22.5, 30.5);

        System.out.print(" " + sum1);
        System.out.print(" " + sum2);
        System.out.print(" " + sum3);
    }
}
