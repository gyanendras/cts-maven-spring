package com.cts.cts2020;

public class Worker extends Person implements Logger,Movable {
	private final Long id;
	private Double salary;
	
	
	

	public Worker(Long id, Double salary, String Fname, String Lname, String gen) {
		super(Fname,Lname);
		this.id = id;
		this.salary = salary;
	}

	// OVerriding is same method signature but redefined in subclass
	public String introduce() {
		// Worker wrk2 = (Worker) this.clone();
		this.setFName("new");
		return getName() + " And Sal is " + salary ;
		//this.setFName(wrk2.);
		
	}

	public static void main(String[] args) {
		Person emp1 = new Worker(1l,10000.00,"Mohan","Keswani","M");
		Person p2 = new Person("Seema","Yadava");
		Person p3 = new Worker(2l,300.00,"Seema","Yadava","F");
		Person p4 = new Worker(2l,300.00,"Seema","Yadava","F");
		Person p5 = p3;//new Worker(2l,300.00,"Seema","Yadava","F");
		
		
		//over loading because of params
		System.out.println(emp1.getName("Dr.")); 
		
		System.out.println(emp1.getName());
		
		Worker wrk = (Worker)emp1;
		
		System.out.println(wrk.getSalary());
		
		// over riding because of class stored in variable.
		//Run time polymorphism
	    System.out.println(emp1.introduce()); 
	    System.out.println(p2.introduce()); 
	    System.out.println(p3.introduce());
	    //color = new Color(red);
	    // color.paint();
	    System.out.println(emp1);
	    System.out.println(p3.hashCode() == p3.hashCode());
	    System.out.println(p3.hashCode() == p5.hashCode());
	    System.out.println(p3.hashCode());
	    System.out.println(p4.hashCode());
	    System.out.println(p5.hashCode());
	    System.out.println(p3.equals(p4));
	    System.out.println(p3.getClass());
	    
	    p3.introduce();
	    p4.introduce();
	    
	    wrk.move();
	    Logger lg = new Worker(21l,300.00,"Seema1","Yadava","F");
	    Movable mv = new Worker(22l,300.00,"Seema2","Yadava","F"); 
	    lg.move();
	    mv.move();
	    System.out.println(Logger.selectDrive());
	    System.out.println(Movable.selectDrive());
	    System.out.println(wrk.selectDrive());
	    
			

	}
	
	@Override
	public boolean equals(Object obj) {
		boolean isEqual = false;
		Worker wrk = (Worker)obj;
	    isEqual = this.fName.equals(wrk.fName) 
		&& 	this.lName == wrk.lName
		&&	this.id == wrk.id;
		
		return isEqual;
	}

	@Override
	 public String toString() {
		 return fName+" "
				+lName+ " "
				+ salary+" "
				+ id;
	 }

	private Double getSalary() {
			return salary;
		
		
	}

	@Override
	public void log() {
		// TODO Auto-generated method stub
		// write console statement in a file
		
	}

	@Override
	public void move() {
		System.out.println("I am a worker moving");
		
	}
	
	public Long getId() {
		return id;
	}
		
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public String selectDrive() {
		//  k=12;
		 //check which drive has vacant space and return it
		 return "K:";
	 }

}
