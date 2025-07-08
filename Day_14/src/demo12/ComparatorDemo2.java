package demo12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    private String name;
    private double totalmarks;
    private int id;

    public Student(int id, String name, double totalmarks) {
        this.id = id;
        this.name = name;
        this.totalmarks = totalmarks;
    }

   
   
    public int compareTo(Student other) {
        return Double.compare(this.totalmarks, other.totalmarks);
    }

    
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', TotalMarks=" + totalmarks + '}';
    }
}

public class ComparatorDemo2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(01, "Dhilip", 473.0));
        students.add(new Student(02, "Natraj", 450.0));
        students.add(new Student(03, "Sesathry", 410.0));

        Collections.sort(students); 

      
            System.out.println(students);
        
    }
}