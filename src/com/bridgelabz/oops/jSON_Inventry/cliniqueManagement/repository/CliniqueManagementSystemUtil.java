package com.bridgelabz.oops.jSON_Inventry.cliniqueManagement.repository;

import java.io.FileReader;
import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.oops.jSON_Inventry.cliniqueManagement.i_services.DoctorInterface;
import com.bridgelabz.oops.jSON_Inventry.cliniqueManagement.i_services.PatientInterface;
import com.bridgelabz.oops.jSON_Inventry.cliniqueManagement.model.DoctorsBEAN;
import com.bridgelabz.oops.jSON_Inventry.cliniqueManagement.model.PatientsBEAN;
import com.bridgelabz.utils.InputUtility;

/**
 * @author Arvind Date: 3/12/2019 purpose: programhave have all the methods of
 *         clinique management System add doctor details , patient details, set
 *         appoint of doctor for patient, search patient details, search doctor
 *         details by her specialization
 */

public class CliniqueManagementSystemUtil implements PatientInterface, DoctorInterface {

	private static final String PATH = "/home/admin1/Desktop/Arvind/FellowShip/Lib/DoctorCliniqueManagement.JSON";
	private static final String PATIENT_PATH = "/home/admin1/Desktop/Arvind/FellowShip/Lib/PatientDetails.JSON";

	static JSONArray jarr = new JSONArray();
	static DoctorsBEAN doctor = new DoctorsBEAN();
	static PatientsBEAN patient = new PatientsBEAN();

	// Method for add Doctor Details in JSON File

	public void addDoctor() throws Exception {
		JSONObject mainObj = new JSONObject();
		JSONObject jo = new JSONObject();

		System.out.println("\nEnter the doctor name ");
		doctor.setDoctorName(InputUtility.nextString());
		jo.put("DoctorName", doctor.getDoctorName());

		System.out.println("\nEnter the Doctor ID ");
		doctor.setDoctorID(InputUtility.nextString());
		jo.put("id", doctor.getDoctorID());

		System.out.println("\nEnter the Specialization of Doctor ");
		doctor.setSpecialization(InputUtility.nextString());
		jo.put("Specialization", doctor.getSpecialization());

		doctor.setAppointment("5");
		jo.put("Appointments", doctor.getAppointment());

		System.out.println("\nEnter the time of Availability");
		doctor.setTimeAvailability(InputUtility.nextString());
		jo.put("Time", doctor.getTimeAvailability());

		System.out.println("\nEnter Shift AM OR PM of Doctor ");
		doctor.setTime_AM_PM((InputUtility.nextString()));
		jo.put("Shifts", doctor.getTime_AM_PM());

		jarr.add(jo);

		mainObj.put("Doctor-List", jarr);

		FileWriter fileWriter = new FileWriter(PATH);
		fileWriter.write(mainObj.toJSONString());
		fileWriter.close();
	}

	// Method for read Doctor JSON file and print it on console

	public void showDoctorList() throws Exception {
		FileReader fileReader = new FileReader(PATH);
		Object object = new JSONParser().parse(fileReader);
		JSONObject jsonObject = (JSONObject) object;

		JSONArray jarray = (JSONArray) jsonObject.get("Doctor-List");

		for (int i = 0; i < jarray.size(); i++) {
			JSONObject jo = (JSONObject) jarray.get(i);
			String docotrName = (String) jo.get("DoctorName");
			System.out.print("Doctor-Name : " + docotrName + " ");
			String docotrID = (String) jo.get("id");
			System.out.print("Doctor-ID : " + docotrID + " ");
			String appointments = (String) jo.get("Appointments");
			System.out.print("Appointments : " + appointments + " ");
			String doctorSpecialization = (String) jo.get("Specialization");
			System.out.print("Specialization : " + doctorSpecialization + "\n\n");
		}

	}

	// Method for add Person details in person JSON File

	public void addPatient() throws Exception {
		JSONObject mainObj = new JSONObject();
		JSONObject jo = new JSONObject();
		JSONArray jarr = new JSONArray();

		System.out.println("Enter the Patient name ");
		String patientName = InputUtility.nextString();
		jo.put("PatientName", patientName);

		System.out.println("Enter the Patient ID ");
		String patientID = InputUtility.nextString();
		jo.put("PatientID", patientID);

		System.out.println("Enter the MobileNo. of Patient ");
		String patientMobNo = InputUtility.nextString();
		jo.put("PatientMobNo", patientMobNo);

		System.out.println("Enter the age of Patient ");
		String patientAge = InputUtility.nextString();
		jo.put("Age", patientAge);

		jarr.add(jo);

		mainObj.put("Patient-List", jarr);

		FileWriter fileWriter = new FileWriter(PATIENT_PATH);
		fileWriter.write(mainObj.toJSONString());
		fileWriter.close();
	}

	// Method for patient search doctor by Specializations

	public void searchPatient() throws Exception {
		FileReader fileReader = new FileReader(PATH);
		Object object = new JSONParser().parse(fileReader);
		JSONObject jsonObject = (JSONObject) object;
		String doctorSpecialization = null;

		JSONArray jarray = (JSONArray) jsonObject.get("Doctor-List");
		String arr[] = new String[jarray.size()];

		for (int i = 0; i < jarray.size(); i++) {
			JSONObject jo = (JSONObject) jarray.get(i);
			doctorSpecialization = (String) jo.get("Specialization");
			arr[i] = doctorSpecialization;
			System.out.println("Specializations are : " + doctorSpecialization + " ");
		}

		System.out.println("\nEnter Specialization for Doctor");
		String specialization = InputUtility.nextString();

		for (int i = 0; i < arr.length; i++) {

			if (specialization.equals(arr[i])) {
				System.out.println("\nDoctor-Details  " + jarray.get(i));

				System.out.println("\nPatient details needed first for take Appoinemnt");
				addPatient();
				System.out.println("\nPatient detail added Suucessfully");

				System.out.println("\nPress 1 for take Appointment " + specialization + " else press 2");
				int check = InputUtility.nextInt();
				if (check == 1) {
					setAppointment(i);
				} else {
					break;
				}
			}
		}
	}

	// Method for take appointment from doctor and
	// checked also doctor can take only 5 appointments only.

	public void setAppointment(int index) throws Exception {
		FileReader fileReader = new FileReader(PATH);
		Object object = new JSONParser().parse(fileReader);
		JSONObject jsonObject = (JSONObject) object;
		JSONArray jarray = (JSONArray) jsonObject.get("Doctor-List");
		JSONObject jo1 = (JSONObject) jarray.get(index);
		String appointment = (String) jo1.get("Appointments");
		System.out.println(appointment);
		if (appointment == "0" || appointment == null) {
			System.out.println("\n5 patient is came already");
		} else {
			int changeAppointment = Integer.parseInt(appointment) - 1;
			String updateAppointment = changeAppointment + "";
			jo1.replace("Appointments", updateAppointment);
			System.out.println("\nYour appointment is fixed.......");
		}
		@SuppressWarnings("resource")
		FileWriter fileWriter = new FileWriter(PATH);
		fileWriter.write(jsonObject.toJSONString());
		fileWriter.flush();
		System.out.println("\nAppintment is changed in JSON File");
	}
}
