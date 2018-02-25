package com.raja.dataStructures.Stack;
public class Test {
	public static void main(String[] args) {
		MyStack ms=new MyStack(5);
		ms.push(1);
		ms.push(1);
		ms.push(1);
		System.out.println(ms.peek());
		ms.push(1);
		ms.push(1);
		ms.pop();
		ms.push(5);
		System.out.println(ms);
		System.out.println(ms.peek());
		System.out.println(ms.size());
		ms.pop();
		System.out.println(ms.size());
		System.out.println(ms);
	}
}
