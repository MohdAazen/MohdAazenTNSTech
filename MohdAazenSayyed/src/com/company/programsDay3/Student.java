package com.company.programsDay3;

public class Student extends Citizen {

	private int rollNo;
	private String collegeName;
	
	
	public Student() {
		super();
		
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", name=" + name + ", aadhaarno="
				+ aadhaarno + ", Phno=" + Phno + ", address=" + address + "]";
	}


	public Student(String name, long aadhaarno,  String address,long phno,int rollNo,String collegeName) {
		super( name,  aadhaarno, address,  phno);
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

}
