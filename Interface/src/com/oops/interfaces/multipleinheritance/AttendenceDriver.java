package com.oops.interfaces.multipleinheritance;

interface AttendanceService
{
	void markAttendance(int employeeId);
}

interface BiometricSystem extends AttendanceService 
{
	void markAttendance(int employeeId);
}

interface ManualSystem extends AttendanceService 
{
	void markAttendance(int employeeId);
}

class EmployeeAttendance implements BiometricSystem, ManualSystem
{
	@Override
	public void markAttendance(int employeeId) {
		System.out.println("Attendance marked for employee: " + employeeId);
	}
}

public class AttendenceDriver {

	public static void main(String[] args) {
		EmployeeAttendance emp = new EmployeeAttendance();
		emp.markAttendance(1234);

	}

}
