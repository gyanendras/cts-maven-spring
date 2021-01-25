package com.cts.cts2020;

public  class Person extends Human implements Comparable<Person> {
	String fName;
	String lName;
	
	public String toString() {
		return this.fName + " "+ this.lName;
	}

	/*
	@Override
	public int hashCode() {
		return this.fName.hashCode() + this.lName.hashCode();
	}*/
	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fName == null) ? 0 : fName.hashCode());
		result = prime * result + ((lName == null) ? 0 : lName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (fName == null) {
			if (other.fName != null)
				return false;
		} else if (!fName.equals(other.fName))
			return false;
		if (lName == null) {
			if (other.lName != null)
				return false;
		} else if (!lName.equals(other.lName))
			return false;
		return true;
	}

	public Person(String fName, String lName) {
		super();
		this.fName = fName;
		this.lName = lName;
	}

	public String getName() {
		return fName + " " + lName;
	}
	
	public void setFName(String fname) {
		fName = fname;
	}

	// Method overloading , same class same
	// and function name but different parameters.
	public String getName(String prefix) {
		return prefix + " " + fName + " " + lName;
	}
	
	public String introduce() {
		return getName();
	}
		
	public static void main(String[] args)  {
		Aadhaar ad = new Aadhaar(234l,null,"Smith");
		Person p = new Person("Tom","Smith");
		p.setAadhaar(ad);
		System.out.println(p.getName());
		System.out.println(p.getName("Professor"));
		System.out.println(p.introduce());
		try {
			Long res = p.authenticity();
			System.out.println(res);
		} catch (NoNameMatchException e) {
			// System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	@Override
	public Long authenticity() throws NoNameMatchException   {
		long score = 0l;
		
		
		try {
			
			if(this.getAadhaar().getfName() != this.fName) {
				throw new NoNameMatchException("Either Fname "
						+ "or Lname did not match with aadhaar");
			}
			
			if( this.getAadhaar().getfName() == this.fName) {
			    score = score+50;	 
			}
			
			if( this.getAadhaar().getlName() == this.lName) {
				score = score+50;	 
			}
		} catch(IllegibleNameException e) {
			  System.out.println("Name not clear on Aadhar " + e.getMessage());
			 // int j = 1/0;
			  //check with DrLicense.
		} catch(NoAadharException e) {
			 System.out.println("No Aadhar occured");
			// check with DrLicense.
		} finally{
			System.out.println("Score calaculated");
		}
		
		System.out.println("Outside try catch finally block");
		
		return score;
	
	}

	@Override
	public int compareTo(Person o) {
		String name = this.fName + " " +this.lName;
		return name.compareTo(o.getName());
	}
}