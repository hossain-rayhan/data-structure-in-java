package main;

public class MyStack {
	int capacity = 3;
	int[] stack = new int[capacity];
	int top = -1;
	
	void push(int x) {
		if(top < capacity - 1) {
			top = top + 1;
			stack[top] = x;
			System.out.println("Successfully added: " + x);
		}else {
			System.out.println("Exception! Stack Overflow.");
		}
	}
	
	int pop() {
		if(top < 0) {
			System.out.println("Exception! Stack Underflow.");
			return -1;
		}
		
		int val = stack[top];
		top = top - 1;
		return val;
	}
	
	int peek() {
		if(top < 0) {
			System.out.println("Exception! Stack Underflow.");
			return -1;
		}
		return stack[top];
		
	}
	
	public static void main(String[] args) {
		System.out.println("Implementing my stack.");
		MyStack obj = new MyStack();
		System.out.println("Peek Returned: " + obj.peek());
		obj.push(10);
		obj.push(20);
		obj.push(30);
		System.out.println("Pop deleted: " + obj.pop());
		obj.push(40);
		System.out.println("Peek Returned: " + obj.peek());
	}
	
}
