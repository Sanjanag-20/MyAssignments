package Org.student;

import Org.department.Department;

public class Student extends Department{

	public void studentName() {
		System.out.println("Student name is SAI-NANDHAN");
			
		}
	public void studentDept() {
		System.out.println("Student Department it CSE");
			
		}
	public void studentId() {
		System.out.println("Student Id is 501");
			
		}
	public static void main(String[] args) {
		Student st = new Student();
		st.collegeCode();
		st.collegeName();
		st.collegeRank();
		st.deptName();
		st.studentName();
		st.studentDept();
		st.studentId();
	}

}
