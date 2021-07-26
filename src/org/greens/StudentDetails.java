package org.greens;

public class StudentDetails {
	public void studName () {
        System.out.println("enter the student Name is Angel");
	}
	public void studId () {
		System.out.println("enter the student Id is 4444");
	}
	public void studDob () {
		System.out.println("enter the student Dob is 01July1990");
	}
	public void studPhone () {
		System.out.println("enter the student Phoneno is 9884048829");
	}
	public void studEmail () {
		System.out.println("enter the student Email is divya05unique@gmail.com");
	}
	public void studAdd () {
		System.out.println("enter the student Address is Chennai");
	}
	public static void main(String[]args) {
		
		StudentDetails sd=new StudentDetails();
		sd.studName();
		sd.studId();
		sd.studDob();
		sd.studPhone();
		sd.studEmail();
		sd.studAdd();
	}
} 



