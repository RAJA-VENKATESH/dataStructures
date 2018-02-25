package com.raja.dataStructures.list;

public class Test {
	public static void main(String[] args) {
		MyLinkedList m=new MyLinkedList();
		m.add(1);
		System.out.println(m);
		m.add(5);
		System.out.println(m);
		m.addFirst(6);
		System.out.println(m);
		m.add(2, "raja");
		System.out.println(m);
		m.add(0, "lav");
		System.out.println(m);
		System.out.println(m.remove(0));
		System.out.println(m);
		System.out.println(m.remove(2));
		System.out.println(m);
		m.addLast(true);
		System.out.println(m);
		m.add(false);
		System.out.println(m);
		System.out.println(m.getFirst());
		System.out.println(m.getLast());
		System.out.println(m.get(0));
		System.out.println(m.get(2));
	}
}
