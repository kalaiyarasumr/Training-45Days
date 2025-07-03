package demo;

public class Employee {
    String name;
    int number;

    public Employee(String n, int no) {
        this.name = n;
        this.number = no;
    }

    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Number: " + number);
    }
}

class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("Kalai", 101);
        
        emp.display();
    }
}
