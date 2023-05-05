package com.masaischool.problem1;

public class Stacks<T> {
	private int size;
	private T[] arr;
	private int top;
	


public Stacks(int size) {
	this.size=size;
	arr= (T[]) new Object[size];
	top=-1;
	
}
public void push(T value) {
	if(top==size-1) {
		System.out.println("stack is full");
	}
	arr[++top]=value;
}
public T pop() {
	if(top==-1) {
		System.out.println("stack is empty");
	}
	return arr[top--];
}

public T peek() {
	if(top==-1) {
		System.out.println("stack is empty");
	}
	return arr[top];
}

public boolean isEmpty() {
	return (top==-1);
}
}


