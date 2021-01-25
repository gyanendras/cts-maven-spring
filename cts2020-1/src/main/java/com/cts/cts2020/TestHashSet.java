package com.cts.cts2020;
import java.util.*;
public class TestHashSet {
	

	public static void main(String[] args) {
		Person p1 = new Person("Monu","Agar");
		Person p2 = new Person("Sonu","Agar");
		Person p3 = new Person("Renu","Agar");
		Person p4 = new Person("Asit","Gupta");
		Person p5 = new Person("Mohit","Gupta");
		
		System.out.println(p4.equals(p5));
		
		Set<Person> pSet = new HashSet<>();
		pSet.add(p1);
		pSet.add(p2);
		pSet.add(p3);
		pSet.add(p4);
		pSet.add(p5);
		
		TreeSet<Person> ts = new TreeSet<>(pSet);
		
		for(Person p:ts) {
			System.out.println(p);
			
		}

	}

}
