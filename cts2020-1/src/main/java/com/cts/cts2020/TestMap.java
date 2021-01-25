package com.cts.cts2020;

import java.util.*;

public class TestMap {

	public static void main(String[] args) {
		Map<Person,Car> m = new HashMap<Person,Car>();
		Person p1 = new Person("Monu","Agar");
		Person p2 = new Person("Sonu","Agar");
		Person p3 = new Person("Renu","Agar");
		Car c1 = new Car("Maruti");
		Car c2 = new Car("Honda");
		Car c3 = new Car("Nexa");
		m.put(p1, c1);
		m.put(p2, c2);
		m.put(p3, c3);
		m.put(p3, c1);
		
		System.out.println(m.get(p3));
		m.keySet();
		m.values();
		
	}

}
