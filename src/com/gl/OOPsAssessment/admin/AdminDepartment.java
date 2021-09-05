package com.gl.OOPsAssessment.admin;

import com.gl.OOPsAssessment.beans.SuperDepartment;

//********************************************************************************************// 
// Admin Department inherits Super Department class and it contains Admin department details. //
//********************************************************************************************//
public class AdminDepartment extends SuperDepartment{
	public String departmentName() {
		return "Admin Department"; 
	}
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
}
