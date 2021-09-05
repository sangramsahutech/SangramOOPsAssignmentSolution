package com.gl.OOPsAssessment.driver;

import com.gl.OOPsAssessment.HR.HRDepartment;
import com.gl.OOPsAssessment.admin.AdminDepartment;
import com.gl.OOPsAssessment.tech.TechDepartment;


//*******************************************************************************//
//                              Driver program                                   //
//*******************************************************************************//
public class Main {
	
	//Display Admin Department details
	static void displayAdmin(AdminDepartment adminObj) {
		System.out.println(" Welcome to "+ adminObj.departmentName());
		System.out.println(adminObj.getTodaysWork());
		System.out.println(adminObj.getWorkDeadline());
		System.out.println(adminObj.isTodayAHoliday());
	}
	
	//Display HR Department details
	static void displayHR(HRDepartment hrObj) {
		System.out.println(" Welcome to "+hrObj.departmentName());
		System.out.println(hrObj.doActivity());
		System.out.println(hrObj.getTodaysWork());
		System.out.println(hrObj.getWorkDeadline());
		System.out.println(hrObj.isTodayAHoliday());
	}
	
	//Display Tech Department details
	static void displayTech(TechDepartment techObj) {
		System.out.println(" Welcome to "+techObj.departmentName());
		System.out.println(techObj.getTodaysWork());
		System.out.println(techObj.getWorkDeadline());
		System.out.println(techObj.getTechStackInformation());
		System.out.println(techObj.isTodayAHoliday());
	}
	
	//Program execution starts from main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDepartment adminObj = new AdminDepartment();
		HRDepartment hrObj = new HRDepartment();
		TechDepartment techObj = new TechDepartment();
		
		displayAdmin(adminObj);
		
		System.out.println();
		
		displayHR(hrObj);
		
		System.out.println();
		System.out.println();
		
		displayTech(techObj);
	}

}
