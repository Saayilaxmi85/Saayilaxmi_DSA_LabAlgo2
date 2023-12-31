package com.greatlearning.oops.departments;

public abstract class SuperDepartment {
	
	public abstract String getTechStackInformation();
	public abstract String doActivity();
	
	public String departmentName() {
		return "Super Department";
	}

	public String getTodaysWork() {
		return "No Work as of now";
	}

	public String getWorkDeadline() {
		return "Nil";
	}

	public String isTodayAHoliday() {
		return "Today is not a holiday";
	}

}

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

	//HR Department class
class HRDepartment extends SuperDepartment {
	@Override
	public String departmentName() {
		return "HR Department";
	}

	@Override
	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance";
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

//Tech Department class
class TechDepartment extends SuperDepartment {
	@Override
	public String departmentName() {
		return "Tech Department";
	}

	@Override
	public String getTodaysWork() {
		return "Complete coding of Module 1";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	@Override
	public String getTechStackInformation() {
		return "Core Java";
	}
	
	@Override
	public String doActivity() {
		return "Team Lunch";
	}
}

