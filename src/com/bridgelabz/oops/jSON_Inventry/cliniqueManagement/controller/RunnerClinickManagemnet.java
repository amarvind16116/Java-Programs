package com.bridgelabz.oops.jSON_Inventry.cliniqueManagement.controller;

import com.bridgelabz.oops.jSON_Inventry.cliniqueManagement.repository.CliniqueManagementSystemUtil;
import com.bridgelabz.utils.InputUtility;

/**
 * @author Arvind Date: 3/12/2019 purpose: program to control the Clinique
 *         Management methods
 */

public class RunnerClinickManagemnet {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CliniqueManagementSystemUtil cliniqueManagementSystemUtil = new CliniqueManagementSystemUtil();
		while (true) {
			System.out.println(
					"\t\t\t\tPress 1. For Add Doctor Details\n\t\t\t\tPress 2. For Book Appointmnet\n\t\t\t\tPress 3. For show List of Doctors");
			int check = InputUtility.nextInt();

			switch (check) {

			case 1:
				cliniqueManagementSystemUtil.addDoctor();
				break;

			case 2:
				cliniqueManagementSystemUtil.searchPatient();
				break;

			case 3:
				cliniqueManagementSystemUtil.showDoctorList();
				break;

			default:
				System.out.println("Entered Wrong number");

			}
			System.out.println("press 1 for another Appointment else press 2 for leave");
			if (InputUtility.nextInt() == 1) {
				continue;
			} else {
				break;
			}
		}
	}
}
