package com.sample.example;

import java.util.Comparator;

public class StringClss {
	
	public static void main(String[] args) throws InterruptedException {
		
		String s = "Srikanth Sankaran";
		String s1 = " ramya";
		int length = s.length();
		
		for (int i = 0; i < length; i++) {
			char charAt = s.charAt(i);
			if(charAt=='h') {
			
				System.out.println(charAt);
				
			}
		}
		
		boolean contains = s.contains("Sankaran");
		System.out.println(contains);
		int indexOf = s.indexOf("S");
		System.out.println(indexOf);
		int lastIndexOf = s.lastIndexOf("r");
		System.out.println(lastIndexOf);
		String concat = s.concat(s1);
		System.out.println(concat);
		boolean endsWith = s.endsWith("sankaran");
		System.out.println(endsWith);
		int hashCode = s.hashCode();
		System.out.println(hashCode);
		String replace = s.replace(s, s1);
		System.out.println(replace);
		String[] split = s.split(s, 5);
		System.out.println(split);
		String substring = s.substring(5, 10);
		System.out.println(substring);
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		String string = s.toString();
		System.out.println(string);
		String trim = s.trim();
		System.out.println(trim);
		Comparator<String> caseInsensitiveOrder = s.CASE_INSENSITIVE_ORDER;
		System.out.println(caseInsensitiveOrder);
		String valueOf = s.valueOf(lastIndexOf);
		System.out.println(valueOf);
		
		
	}


}
