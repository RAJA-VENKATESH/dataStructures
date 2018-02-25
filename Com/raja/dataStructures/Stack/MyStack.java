package com.raja.dataStructures.Stack;
public class MyStack {
	int cap,top=-1;
	Object stk[];
	public MyStack(int cap) {
		this.cap = cap;
		stk=new Object[cap];
	}
	public boolean push(Object obj) {
		if(top==cap-1){
			System.out.println("queue is overflow");
			return false;
		}
		stk[++top]=obj;
		return true;
	}
	public Object pop(){
		if(top==-1){
			System.out.println("queue is underflow");
			return null;
		}
		return stk[top--];
	}
	public Object peek(){
		if(top==-1){
			System.out.println("stack is empty");
			return null;
		}
		return stk[top];
	}
	public int size(){
		return top+1;
	}
	@Override
	public String toString() {
		String st="[ ";
		for (int i = 0; i <=top; i++) {
			st=st+stk[i]+" ";
		}
		return st+"]";
	}
}
