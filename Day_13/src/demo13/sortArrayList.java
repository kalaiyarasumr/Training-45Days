package demo13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class sortArrayList {
	    public static void main(String[] args) {
	    	  List<Integer> li = new ArrayList<>();
	          List<String> ls = new ArrayList<>();       
	          li.add(10);
	          li.add(20);
	          li.add(30);        
	          ls.add("MorningStar");
	          ls.add("Hades");
	          ls.add("Lucifer");
	          ls.add("A");
	          ls.add("B"); 
	          ls.forEach(s -> System.out.println(s));
	          ls.contains("A");
	          for (String i : li) {
	              System.out.print(i);
	          }
	    }
}

	     