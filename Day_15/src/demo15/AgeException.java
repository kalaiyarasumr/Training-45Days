package demo15;

class AgeExceptionDemo extends Exception {
    public AgeExceptionDemo(String message) {
        super(message);
    }
}

class Validator {
    public void isQualified(int age) throws AgeExceptionDemo {
        if (age < 18) {
            throw new AgeExceptionDemo("Age is less than 18. Not qualified.");
        } else {
            System.out.println("Age is valid. You are qualified.");
        }
    }
}

public class AgeException {
    public static void main(String[] args) {
        Validator v = new Validator();
        int age = 16; 

        try {
            v.isQualified(age);
        } catch (AgeExceptionDemo e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
