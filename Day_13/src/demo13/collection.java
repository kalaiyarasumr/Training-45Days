package demo13;

import java.util.*;

public class collection {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Which type of collection do you want to create?");
        System.out.println("Options: ArrayList, LinkedList, Vector");
        System.out.print("Enter your choice: ");
        String choice = sc.nextLine().trim();

        List<Integer> list;

        switch (choice.toLowerCase()) {
            case "arraylist":
                list = new ArrayList<>();
                System.out.println("ArrayList created.");
                break;

            case "linkedlist":
                list = new LinkedList<>();
                System.out.println("LinkedList created.");
                break;

            case "vector":
                list = new Vector<>();
                System.out.println("Vector created.");
                break;

            default:
                System.out.println("Invalid choice. Defaulting to ArrayList.");
                list = new ArrayList<>();
        }
        System.out.print("Enter number of elements to add: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " integer values:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        System.out.println("Your " + choice + ": " + list);
        sc.close();
    }
}
