package demo18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailMatch {

    public static void main(String[] args) {

        String str = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern emailpattern = Pattern.compile(str);

        String[] emails = {"demo@demo.com", "demo.demo@com", "demo@demo"};

        for (String email : emails) {
            Matcher matcher = emailpattern.matcher(email);
            System.out.println(email + " --> " + matcher.matches());
        }
    }
}
