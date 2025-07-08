package demo13;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
public class leastArraylist {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(20,20,30,40,40);
		System.out.println(li);
		Set<Integer> st = new HashSet<>(li);
		System.out.println(st);
		Set<Integer> oddset =  li.stream().filter(num->num%2!=0).collect(Collectors.toSet());
	     System.out.println(oddset);
	     
	}

}
