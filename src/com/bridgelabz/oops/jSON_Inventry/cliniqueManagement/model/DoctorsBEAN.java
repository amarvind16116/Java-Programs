package com.bridgelabz.oops.jSON_Inventry.cliniqueManagement.model;

/**
 * @author Arvind
 *  Date: 3/12/2019 
 *  purpose: programhave All the Getter Setter methods of Doctor details
 */

public class DoctorsBEAN {
	
	private String doctorName;
	private String doctorID;
	private String specialization;
	private String timeAvailability;
	private String time_AM_PM;
	private String appointment;
	
	public String getTime_AM_PM() {
		return time_AM_PM;
	}
	public String setTime_AM_PM(String time_AM_PM) {
		return this.time_AM_PM = time_AM_PM;
	}
	public String getAppointment() {
		return appointment;
	}
	public String setAppointment(String appointment) {
		return this.appointment = appointment;
	}
	
	public String getDoctorName() {
		return doctorName;
	}
	public String setDoctorName(String doctorName) {
		return this.doctorName = doctorName;
	}
	public String getDoctorID() {
		return doctorID;
	}
	public String setDoctorID(String doctorID) {
		return this.doctorID = doctorID;
	}
	public String getSpecialization() {
		return specialization;
	}
	public String setSpecialization(String specialization) {
		return this.specialization = specialization;
	}
	public String getTimeAvailability() {
		return timeAvailability;
	}
	public String setTimeAvailability(String timeAvailability) {
		return this.timeAvailability = timeAvailability;
	}
}
