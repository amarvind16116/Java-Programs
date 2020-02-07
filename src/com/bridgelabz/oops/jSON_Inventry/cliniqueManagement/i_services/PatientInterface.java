package com.bridgelabz.oops.jSON_Inventry.cliniqueManagement.i_services;

/**
 * @author Arvind
 *  Date: 3/12/2019 
 *  purpose: program  have abstract method of add patient details , 
 *  serach patient and set Appointment to doctor
 */

public interface PatientInterface {
	
	// Abstract method for  write in JSON file
	public void addPatient() throws Exception ;
	
	
	// Abstract method to search for desired Doctor
	public void searchPatient() throws Exception ;
	
	
	// Abstract method for to set Appointment for patient
	public void setAppointment(int index) throws Exception ;
}
