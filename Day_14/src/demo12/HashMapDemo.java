package demo12;

import java.util.*;

public class Student {
private int id;
private String name;
private double marks;

public Student(int id, String name, double marks) {
   this.id = id;
   this.name = name;
   this.marks = marks;
}

public int getId() { return id; }
public String getName() { return name; }
public double getMarks() { return marks; }

@Override
public String toString() {
   return "Student{id=" + id + ", name='" + name + "', marks=" + marks + '}';
}
}

public class HashMapDemo {
public static void main(String[] args) {
   HashMap<Integer, Student> studentMap = new HashMap<>();

   studentMap.put(101, new Student(101, "Alice", 85.5));
   studentMap.put(102, new Student(102, "Bob", 78.0));
   studentMap.put(103, new Student(103, "Charlie", 92.3));

   System.out.println("Student Map Entries:");
   for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
       System.out.println("Key (Roll No): " + entry.getKey() + " => Value: " + entry.getValue());
   }
}
}