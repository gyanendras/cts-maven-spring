package com.cts.cts2020;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class lambdaTests {
	
	Employee emp = new Employee();
	
	static void  carAndOwners(Proceessable pr, Person p, Car c) {
	     System.out.println("Car and Owner details: " 
	                         + pr.process(p, c));
	}
	
	
	public static void main(String[] args ) {
		Greetable gr = ()->{
			System.out.println("Hi to all");
		};
		
		Greetable gr1 = ()->{
			System.out.println("Hello All");
		}; 
		
		gr.greet();
		gr1.greet();
		
		Proceessable pr =(Person pr1, Car cr)->{
			return pr1.getName() + " has a " + cr.getName();
			
		};
		
		BiFunction<Person,Car,String> bf = (Person pr1, Car cr)->{
			return pr1.getName() + " has a " + cr.getName();
		};
		
		
		
		Person p = new Person("Mohan","Keswani");
		Car c = new Car("Honda");
		
		System.out.println(pr.process(p, c));
		Person pr2 = new Person("Sheela","Ray");
		Car c2 = new Car("Jeep");
		
		carAndOwners(
				(Person pr1, Car cr)->{return pr1.getName() +" "+cr.getName();}
				,pr2 , c2);
	
	
		carAndOwners(pr,pr2,c2);	
		
		List<Car> cList = new ArrayList<>();
		List<Car> cList2 = null;
		cList.add(new Car("Honda"));
		cList.add(new Car("Maruti"));
		cList.add(new Car("BMW"));
		cList.add(new Car("Bravia"));
		cList.add(new Car("Bentley"));
		
		Consumer<Car> func = (Car s)->{System.out.println(s);}; 
		
		Consumer<Car> f2 = null;
		cList.stream().forEach(func);
		cList.stream().forEach(s->System.out.print(" + "+s));
		cList.stream().filter(x->!x.getName().equals("BMW")).forEach(z->System.out.print(" "+z));;
		
		cList2 = cList.stream().filter(x->!x.getName().equals("BMW")).collect(Collectors.toList());
		
		System.out.println("\n Collection "+ cList2);
		
		//Filter out all the cars that dont start with B
		
		List<Person> ls = cList.stream().map(x->{return new Person("owner",x.getName());}).collect(Collectors.toList());
		System.out.println(ls);
		
		System.out.println(bf.apply(pr2, c2));
	}
	
	
	
	// lambda function that 
	// adds 2 number and returns sum - 
	// create a functional interface
	  // addable
	
	// supplier
	
	// predicate
	
	

}
