package com.cts.cts2020;

public class Aadhaar {
	Long aadhaarNum;
	String fName;
	String lName;
	

	public Aadhaar() {
		super();
	}


	public Aadhaar(Long aadhaarNum, String fName, String lName) {
		super();
		this.aadhaarNum = aadhaarNum;
		this.fName = fName;
		this.lName = lName;
	}


	public Long getAadhaarNum() {
		
		return aadhaarNum;
	}


	public void setAadhaarNum(Long aadhaarNum) {
		this.aadhaarNum = aadhaarNum;
	}


	public String getfName() throws IllegibleNameException {
		if(fName == null ) throw new IllegibleNameException("Null Name");
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
