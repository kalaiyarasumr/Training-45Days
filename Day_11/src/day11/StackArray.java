package day11;

import java.util.Stack;

public class StackArray {
	int size,cap;
	int[] arr;
	int top;
	public StackArray(int size) {
		cap = size;
		top =-1;
		arr = new int[size] ;	
	}
	public int push(int x) {
		if(isEmpty()) {
			System.out.print("Stack Overflow");
			return-1;
		}
		top++;
		return arr[top]=x;
	}
	public int pop() {
		if(isFull()) {
			System.out.println("Stack Underflow");
			return-1;
		}
		return arr[top--];
	}
	public boolean isEmpty() {
		return top<0;
		
	}
	public boolean isFull() {
		return top>=cap-1;
	}

	public static  void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		System.out.println(st);
		st.pop();
		System.out.print(st);
	}

}
