package demo12;

	class Food {
	 void display() {
	     System.out.println(" ");
	 }
	}
	class Veg extends Food {
	 void showVeg() {
	     System.out.println("This is a Veg dish.");
	 }
	}
	class NonVeg extends Food {
	 void showNonVeg() {
	     System.out.println("This is a Non-Veg dish.");
	 }
	}
	class CurdRice extends Veg {
	 void showCurdRice() {
	     System.out.println("Dish: Curd Rice");
	 }
	}
	class ChkBiriyani extends NonVeg {
	 void showChkBiriyani() {
	     System.out.println("Dish: Chicken Biriyani");
	 }
	}
	public class Inheritance {
	 public static void main(String[] args) {
	     System.out.println("Veg Food:");
	     CurdRice vegDish = new CurdRice();
	     vegDish.display();
	     vegDish.showVeg();
	     vegDish.showCurdRice();
	     System.out.println("\nNon-Veg Food:");
	     ChkBiriyani nonVegDish = new ChkBiriyani();
	     nonVegDish.display();
	     nonVegDish.showNonVeg();
	     nonVegDish.showChkBiriyani();
	 }
	}


