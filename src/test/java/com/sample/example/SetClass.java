package com.sample.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SetClass {

	public static void main(String[] args) {

		Set<Integer> s = new HashSet<Integer>();
		s.add(20);
		s.add(30);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(50);
		for (Integer integer : s) {

			System.out.println(integer);
		}

		List<Integer> li = new ArrayList<Integer>();
		li.add(50);
		li.add(40);
		li.add(30);
		li.addAll(s);
		System.out.println(li);
		
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(20, "java");
		m.put(30, "Srikanth");
		m.put(40, "Ramya");
		System.out.println(m);
		String string = m.get(30);
		System.out.println(string);
		Set<Integer> keySet = m.keySet();System.out.println(keySet);
		
	}
}
