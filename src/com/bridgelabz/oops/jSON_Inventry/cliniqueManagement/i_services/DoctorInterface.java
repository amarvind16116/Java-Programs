package com.bridgelabz.oops.jSON_Inventry.cliniqueManagement.i_services;

/**
 * @author Arvind
 *  Date: 3/12/2019 
 *  purpose: program have abstract method of add doctor details or show doctor list
 */

public interface DoctorInterface {
	
	// Abstract method for Doctor Details write in JSON file
	public void addDoctor() throws Exception ;
	
	// Abstract method for show details of Doctor
	public void showDoctorList() throws Exception ;
	
}
