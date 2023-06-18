package com.gitdemo;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("karan");
		set.add("Arjun");
		set.add("Raja");
		set.add("Babu");
		set.add("Mihir");
		set.stream().forEach(a->System.out.println(a));

	}

}
