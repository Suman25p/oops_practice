package com.oops.encapsulation;
class Patient
{
	private String patientName;
	private int age;
	
	public String getPatientName() {
		return patientName;
	}
	
	public void setPatientName(String patientName) {
		if(!patientName.isEmpty()) {
			this.patientName = patientName;
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age > 0) {
			this.age = age;
		}
	}
}

public class PatientDriver {

	public static void main(String[] args) {
		
		Patient patient = new Patient();
		patient.setPatientName("Raj");
		patient.setAge(45);
		
		System.out.println("-----Patient Details------");
		System.out.println("Name: " + patient.getPatientName());
		System.out.println("Age: " + patient.getAge());
	}

}

//Why encapsulation?
//Age validation ensures data correctness.