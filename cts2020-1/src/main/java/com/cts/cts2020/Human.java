package com.cts.cts2020;

import java.time.LocalDate;

public abstract class Human {
 Aadhaar aadhaar;
 Long drLicence;
 
   public Human() {
			super();
		}
	
	public Human(Aadhaar aadhaar, Long drLicence) {
	super();
	this.aadhaar = aadhaar;
	this.drLicence = drLicence;
    }

   
	public  Aadhaar getAadhaar() throws NoAadharException {
		if(aadhaar == null ) throw new NoAadharException();
		return aadhaar;
	}


	public void setAadhaar(Aadhaar aadhaar) {
		this.aadhaar = aadhaar;
	}


	public Long getDrLicence() {
		return drLicence;
	}


	public void setDrLicence(Long drLicence) {
		this.drLicence = drLicence;
	}
	
	public abstract Long authenticity() throws NoNameMatchException ;

	
}
