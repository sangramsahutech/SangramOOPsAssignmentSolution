package com.gl.OOPsAssessment.tech;

import com.gl.OOPsAssessment.beans.SuperDepartment;

//******************************************************************************************//
// Tech Department inherits Super Department class and it contains Tech department details. //
//******************************************************************************************//
public class TechDepartment extends SuperDepartment {
	public String departmentName() {
		return " Tech Department ";
	}
	public String getTodaysWork() {
		return "Complete coding of module 1";
	}
	public String getWorkDeadline() {
		return "Complete by EOD ";
	}
	public String getTechStackInformation() {
		return " Core Java";
	}
}
