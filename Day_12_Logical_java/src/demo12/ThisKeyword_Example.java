package demo12;

public class ThisKeyword_Example {
    int id;
    String name;
    public ThisKeyword_Example()
    {
    	System.out.println("Details Created");
    }
    public ThisKeyword_Example(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showDetails() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
    }

    public static void main(String[] args) {
        ThisKeyword_Example obj = new ThisKeyword_Example(18, "Kalai");
        obj.showDetails();
    }
}
