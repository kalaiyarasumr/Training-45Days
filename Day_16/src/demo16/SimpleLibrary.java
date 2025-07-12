package demo16;

import java.util.*;

class Book {
    int id;
    String title;
    String author;
    boolean isBorrowed = false;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return id + ": " + title + " by " + author + (isBorrowed ? " [Borrowed]" : "");
    }
}

class Member {
    int id;
    String name;
    ArrayList<Integer> borrowedBooks = new ArrayList<>();

    Member(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SimpleLibrary {
    static Scanner sc = new Scanner(System.in);
    static HashMap<Integer, Book> books = new HashMap<>();
    static HashMap<Integer, Member> members = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1.Admin  2.Member  3.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> adminMenu();
                case 2 -> memberMenu();
                case 3 -> { System.out.println("Goodbye!"); return; }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    // ========== ADMIN ==========
    static void adminMenu() {
        while (true) {
            System.out.println("\nAdmin: 1.Add Book 2.View Books 3.Search 4.Back");
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1 -> {
                    System.out.print("Enter ID: "); int id = sc.nextInt(); sc.nextLine();
                    if (books.containsKey(id)) {
                        System.out.println("ID exists."); return;
                    }
                    System.out.print("Title: "); String title = sc.nextLine();
                    System.out.print("Author: "); String author = sc.nextLine();
                    books.put(id, new Book(id, title, author));
                    System.out.println("Book added.");
                }
                case 2 -> books.values().forEach(System.out::println);
                case 3 -> {
                    System.out.print("Search title/author: ");
                    String key = sc.nextLine().toLowerCase();
                    books.values().stream()
                         .filter(b -> b.title.toLowerCase().contains(key) || b.author.toLowerCase().contains(key))
                         .forEach(System.out::println);
                }
                case 4 -> { return; }
                default -> System.out.println("Invalid.");
            }
        }
    }

    static void memberMenu() {
        while (true) {
            System.out.println("\nMember: 1.Register 2.Borrow 3.Return 4.View Borrowed 5.Back");
            int ch = sc.nextInt();
            switch (ch) {
                case 1 -> {
                    System.out.print("Enter ID: "); int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Name: "); String name = sc.nextLine();
                    members.put(id, new Member(id, name));
                    System.out.println("Registered.");
                }
                case 2 -> {
                    System.out.print("Member ID: "); int mid = sc.nextInt();
                    if (!members.containsKey(mid)) { System.out.println("Not found."); return; }
                    Member m = members.get(mid);
                    if (m.borrowedBooks.size() >= 5) {
                        System.out.println("Max 5 books allowed.");
                        return;
                    }
                    System.out.print("Book ID: "); int bid = sc.nextInt();
                    if (!books.containsKey(bid) || books.get(bid).isBorrowed) {
                        System.out.println("Book not available.");
                        return;
                    }
                    books.get(bid).isBorrowed = true;
                    m.borrowedBooks.add(bid);
                    System.out.println("Borrowed.");
                }
                case 3 -> {
                    System.out.print("Member ID: "); int mid = sc.nextInt();
                    if (!members.containsKey(mid)) return;
                    Member m = members.get(mid);
                    System.out.print("Book ID to return: "); int bid = sc.nextInt();
                    if (m.borrowedBooks.remove((Integer) bid)) {
                        books.get(bid).isBorrowed = false;
                        System.out.println("Returned.");
                    } else {
                        System.out.println("Not borrowed.");
                    }
                }
                case 4 -> {
                    System.out.print("Member ID: "); int mid = sc.nextInt();
                    if (!members.containsKey(mid)) return;
                    Member m = members.get(mid);
                    if (m.borrowedBooks.isEmpty()) {
                        System.out.println("No books borrowed.");
                    } else {
                        m.borrowedBooks.forEach(id -> System.out.println(books.get(id)));
                    }
                }
                case 5 -> { return; }
                default -> System.out.println("Invalid.");
            }
        }
    }
}