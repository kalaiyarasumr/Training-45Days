package demo12;

import java.util.*;

class Product implements Comparable<Product> {
    private String name;
    private double price;
    private int id;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

   
   
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }

    
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', price=" + price + '}';
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Pen", 20.5));
        products.add(new Product(2, "Notebook", 50.0));
        products.add(new Product(3, "Pencil", 10.0));

        Collections.sort(products); 

      
            System.out.println(products);
        
    }
}
