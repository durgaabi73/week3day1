package org.college;

public class Student extends College {

	public void studentName() {
		
		System.out.println("Durga.U");
	}
	
	public void studentDepartment() {
		
		System.out.println("Agricuture Enginerring");
	}
	
	public void studentID() {
		
		System.out.println("ID:13");
	}
	
	public static void main(String[] args) {
	Student obj= new Student();
	obj.studentName();
	obj.collegeName();
	obj.collegeCode();
	obj.departmentName();
	obj.collegeRank();
	obj.studentID();
	obj.studentDepartment();
		
		

	}

}
