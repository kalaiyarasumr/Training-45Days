package demo13;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(10);
        li.add(20);
        li.add(30);
       
        for(int l :li) {
        System.out.print(l+" ");
     }
    }
}
