package com.gl.OOPsAssessment.HR;

import com.gl.OOPsAssessment.beans.SuperDepartment;

//**************************************************************************************//
// HR Department inherits Super Department class and it contains HR department details. //
//**************************************************************************************//
public class HRDepartment extends SuperDepartment {
	public String departmentName() {
		return " Hr Department ";
	}
	public String getTodaysWork() {
		return "Fill today’s worksheet and mark your attendance";
	}
	public String getWorkDeadline() {
		return "Complete by EOD ";
	}
	public String doActivity() {
		return "team Lunch";
	}
}
