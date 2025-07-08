package demo12;

import java.util.*;

class Produc {
    private String name;
    private double price;
    private int id;

    public Produc(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice() { return price; }
    public String getName() { return name; }
    public int getId() { return id; }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', price=" + price + '}';
    }
}

class NameComparator implements Comparator<Produc> {
    @Override
    public int compare(Produc p1, Produc p2) {
        return p1.getName().compareTo(p2.getName());
    }
}

class IdComparator implements Comparator<Produc> {
    @Override
    public int compare(Produc p1, Produc p2) {
        return Integer.compare(p1.getId(), p2.getId());
    }
}

public class StringComparisonDemo {
    public static void main(String[] args) {
        ArrayList<Produc> products = new ArrayList<>();
        products.add(new Produc(3, "Pencil", 10.0));
        products.add(new Produc(1, "Pen", 20.5));
        products.add(new Produc(2, "Notebook", 50.0));

        System.out.println("Sort by Name:");
        Collections.sort(products, new NameComparator());
        products.forEach(System.out::println);

        System.out.println("\nSort by ID:");
        Collections.sort(products, new IdComparator());
        products.forEach(System.out::println);
    }
}
