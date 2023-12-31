package com.greatlearning.oops.departments;

public class AdmDept {
	
	//Admin Department class
	class AdminDepartment extends SuperDepartment {
		@Override
		public String departmentName() {
			return "Admin Department";
		}

		@Override
		public String getTodaysWork() {
			return "Complete your documents submission";
		}

		@Override
		public String getWorkDeadline() {
			return "Complete by EOD";
		}
		
		@Override
		public String doActivity() {
			return "Team Lunch";
		}
		
		@Override
		public String getTechStackInformation() {
			return "Core Java";
		}
	}

}
