package com.masai;

public class MyStack implements  Stack {
	
	private int[] stack;
	private int top;
	
	final static int MAX_SIZE=5;
	
	public MyStack() {
		stack=new int[MAX_SIZE];
		top = -1;
	}
	
	public void push(int element) throws OverflowException{
		
		if(top<MAX_SIZE) {
			if(top==-1) 
				top++;
			
			stack[top++] = element;
		}
		throw new OverflowException("Stack is already full...");
		
		
		
	}
	public int pop() throws UnderflowException{
	
		int value = 0;
		if(top>-1) {
			value = stack[top];
			top--;
			
			if(top==0) {
				top = -1;
			}
			
			return value;
			
		}
		throw new UnderflowException("Stack is empty...");
		
		
		
	}
	public int peek() throws UnderflowException{
		
		if(top >-1) {
			return stack[top-1];
		}
		throw new UnderflowException("Stack is empty...");
	
	}
	public String toString() {
		return Stack.displayStackElements(stack);
	}

}
