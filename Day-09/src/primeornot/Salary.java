package primeornot;

import java.util.Scanner;

public class Salary {

    public static double totalSalary(double basic) {
        double hra = 0.20 * basic;
        double ta = 0.10 * basic;
        double other = 1.0 * basic;
        return basic + hra + ta + other;
    }

    public static double calculateTax(double total) {
        return 0.10 * total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        double total = totalSalary(basic);     
        double tax = calculateTax(total);     
        double net = total - tax;              

        System.out.println("Total Salary (before tax): ₹" + total);
        System.out.println("Tax (10%): ₹" + tax);
        System.out.println("Net Salary (after tax): ₹" + net);

        sc.close();
    }
}
