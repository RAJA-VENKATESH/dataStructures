package com.raja.dataStructures.list;
public class MyLinkedList {
	Node head;
	class Node{
		Object data;
		Node next;
		public Node(Object data) {
			this.data = data;
		}
	}
	public boolean add(Object obj){
		Node newNode=new Node(obj);
		if(head==null){
			head=newNode;
			return true;
		} else {
			Node n=head;
			while(n.next!=null)
				n=n.next;
			n.next=newNode;
			return true;
		}
	}
	public boolean addFirst(Object obj){
		Node newNode=new Node(obj);
		newNode.next=head;
		head=newNode;
		return true;
	}
	public boolean addLast(Object obj){
		Node newNode=new Node(obj);
			Node n=head;
			while(n.next!=null)
				n=n.next;
			n.next=newNode;
			return true;
	}
	public boolean add(int position,Object obj){
		Node newNode=new Node(obj);
		if(position==0){
			addFirst(obj);
			return true;
		}
		else {
			Node n=head;
			for (int i = 0; i < position-1; i++) 
				n=n.next;
			newNode.next=n.next;
			n.next=newNode;
			return true;
		}
	}
	public Object remove(int position){
		if(position==0){
			head=head.next;
			return head.data;
		}
		else {
			Node n=head;
			Node temp=null;
			for (int i = 0; i < position-1; i++) 
				n=n.next;
			temp=n.next;
			n.next=temp.next;
			Object obj=temp.data;
			temp=null;
			return obj;
		}
	}
	public Object getFirst(){
		return head.data;
	}
	public Object getLast(){
		Node n=head;
		while(n.next!=null)
			n=n.next;
		return n.data;
	}
	public Object get(int position){
		if(position==0)
			return getFirst();
		Node n=head;
		for (int i = 0; i < position; i++) 
			n=n.next;
		return n.data;
	}
	
	@Override
	public String toString() {
		String st="";
		Node n=head;
		st=st+"[ ";
		while(n!=null){
			st=st+n.data+" ";
			n=n.next;
		}
		st=st+"]";
		return st;
	}
}
