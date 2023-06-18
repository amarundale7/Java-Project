package com.gitdemo;

import java.util.ArrayList;import java.util.Map;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Amar");
		list.add("Satywan");
		list.add("Kalyani");
		list.add("Mahesh");
		
		list.stream().forEach(m->System.out.println(m));
		
		
	}

}
