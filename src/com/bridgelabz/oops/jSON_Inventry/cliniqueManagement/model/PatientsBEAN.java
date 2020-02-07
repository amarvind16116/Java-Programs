package com.bridgelabz.oops.jSON_Inventry.cliniqueManagement.model;

/**
 * @author Arvind
 *  Date: 3/12/2019 
 *  purpose: programhave All the Getter Setter methods of Patient details
 */


public class PatientsBEAN {
	
	private static String patientName;
	private static String patientID;
	private static String patientMobNo;
	private static String patientAge;
	
	public static String getPatientName() {
		return patientName;
	}
	public static String setPatientName(String patientName) {
		return PatientsBEAN.patientName = patientName;
	}
	public static String getPatientID() {
		return patientID;
	}
	public static String setPatientID(String patientID) {
		return PatientsBEAN.patientID = patientID;
	}
	public static String getPatientMobNo() {
		return patientMobNo;
	}
	public static String setPatientMobNo(String patientMobNo) {
		return PatientsBEAN.patientMobNo = patientMobNo;
	}
	public static String getPatientAge() {
		return patientAge;
	}
	public static String setPatientAge(String patientAge) {
		return PatientsBEAN.patientAge = patientAge;
	}
}
