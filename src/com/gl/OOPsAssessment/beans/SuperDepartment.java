package com.gl.OOPsAssessment.beans;

//***************************************************************************************************//
// Super Department is the super class of all departments. Hierarchical inheritance being performed. //
//***************************************************************************************************//

public class SuperDepartment {
	protected String departmentName() {
		return "Super Department ";
	}
	protected String getTodaysWork() {
		return "No Work as of now";
	}
	protected String getWorkDeadline() {
		return "Nil";
	}
	public String isTodayAHoliday() {
		return "Today is not a holiday";
	}
}
