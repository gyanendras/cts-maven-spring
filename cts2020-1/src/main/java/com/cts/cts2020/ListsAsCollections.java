package com.cts.cts2020;

import java.util.ArrayList;
import java.util.*;
import java.util.Iterator;

public class ListsAsCollections {

	public static void main(String[] args) {
		ArrayList<Person> al = new ArrayList<Person>();
		al.add(new Person("Ram","Gupta"));
		al.add(new Person("Sonu","Gupta"));
		al.add(new Person("Monu","Handa"));
		al.add(new Person("Renu","Handa"));
		
		System.out.println(al.get(2).getName());
		
		for(Person p:al) {
			System.out.println(p.getName());
			
		}
		
		Iterator<Person> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println("Using Itr "+ itr.next().getName());
		}
		
		List<Integer> alInt = new ArrayList<>();
		alInt.add(1);
		// add four more integer any and then print 
		// them using for each and Iterator
		
		

	}

}
