package demo15;

import java.util.Scanner;

class NegativeException extends Exception {
 public NegativeException(String message) {
     super(message);
 }
}

public class BasicCalculor {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     try {
         System.out.print("Enter first positive number: ");
         String input1 = sc.nextLine();
         int num1 = Integer.parseInt(input1);  

         System.out.print("Enter second positive number: ");
         String input2 = sc.nextLine();
         int num2 = Integer.parseInt(input2);  

         if (num1 < 0 || num2 < 0) {
             throw new NegativeException("Both numbers must be positive!");
         }

         if (num1 <= num2) {
             System.out.println("Note: First number is not greater than second number.");
         } else {
             System.out.println("First number is greater than second number.");
         }

         // Perform Operations
         System.out.println("\n--- Calculator Menu ---");
         System.out.println("1. Addition");
         System.out.println("2. Subtraction");
         System.out.println("3. Multiplication");
         System.out.println("4. Division");
         System.out.print("Choose operation (1-4): ");
         int choice = sc.nextInt();

         switch (choice) {
             case 1:
                 System.out.println("Addition = " + (num1 + num2));
                 break;
             case 2:
                 System.out.println("Subtraction = " + (num1 - num2));
                 break;
             case 3:
                 System.out.println("Multiplication = " + (num1 * num2));
                 break;
             case 4:
                 if (num2 == 0) {
                     throw new ArithmeticException("Cannot divide by zero!");
                 }
                 System.out.println("Division = " + (num1 / num2));
                 break;
             default:
                 System.out.println("Invalid choice!");
         }

     } catch (NumberFormatException e) {
         System.out.println("Error: Invalid number format. Please enter only numbers.");
     } catch (NegativeException e) {
         System.out.println("Error: " + e.getMessage());
     } catch (ArithmeticException e) {
         System.out.println("Error: " + e.getMessage());
     } catch (Exception e) {
         System.out.println("Unexpected error: " + e.getMessage());
     } finally {
         sc.close();
         System.out.println("\nCalculator program ended.");
     }
 }
}
