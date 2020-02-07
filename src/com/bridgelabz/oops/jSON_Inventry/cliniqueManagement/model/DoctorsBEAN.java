package com.bridgelabz.oops.jSON_Inventry.cliniqueManagement.model;

/**
 * @author Arvind
 *  Date: 3/12/2019 
 *  purpose: programhave All the Getter Setter methods of Doctor details
 */

public class DoctorsBEAN {
	
	private static String doctorName;
	private static String doctorID;
	private static String specialization;
	private static String timeAvailability;
	private static String time_AM_PM;
	
	public static String getTime_AM_PM() {
		return time_AM_PM;
	}
	public static String setTime_AM_PM(String time_AM_PM) {
		return DoctorsBEAN.time_AM_PM = time_AM_PM;
	}
	public static String getAppointment() {
		return appointment;
	}
	public static String setAppointment(String appointment) {
		return DoctorsBEAN.appointment = appointment;
	}
	private static String appointment;
	
	public static String getDoctorName() {
		return doctorName;
	}
	public static String setDoctorName(String doctorName) {
		return DoctorsBEAN.doctorName = doctorName;
	}
	public static String getDoctorID() {
		return doctorID;
	}
	public static String setDoctorID(String doctorID) {
		return DoctorsBEAN.doctorID = doctorID;
	}
	public static String getSpecialization() {
		return specialization;
	}
	public static String setSpecialization(String specialization) {
		return DoctorsBEAN.specialization = specialization;
	}
	public static String getTimeAvailability() {
		return timeAvailability;
	}
	public static String setTimeAvailability(String timeAvailability) {
		return DoctorsBEAN.timeAvailability = timeAvailability;
	}
}
