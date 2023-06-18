package com.gitdemo;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		list.add("Satya");
		list.add("Pravin");
		list.add("Datta");
		list.add("Amar");
		list.add("Asha");
		
		list.stream().forEach(x->System.out.println(x));
	}

}
