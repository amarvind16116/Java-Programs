package com.bridgelabz.oops.jSON_Inventry.cliniqueManagement.model;

/**
 * @author Arvind
 *  Date: 3/12/2019 
 *  purpose: programhave All the Getter Setter methods of Patient details
 */


public class PatientsBEAN {
	
	private String patientName;
	private String patientID;
	private String patientMobNo;
	private String patientAge;
	
	public String getPatientName() {
		return patientName;
	}
	public String setPatientName(String patientName) {
		return this.patientName = patientName;
	}
	public String getPatientID() {
		return patientID;
	}
	public String setPatientID(String patientID) {
		return this.patientID = patientID;
	}
	public String getPatientMobNo() {
		return patientMobNo;
	}
	public String setPatientMobNo(String patientMobNo) {
		return this.patientMobNo = patientMobNo;
	}
	public String getPatientAge() {
		return patientAge;
	}
	public String setPatientAge(String patientAge) {
		return this.patientAge = patientAge;
	}
}
