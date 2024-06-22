package com.company.programsDay3;

public class Citizen {

	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Citizen(String name, long aadhaarno, long phno, String address) {
		
		this.name = name;
		this.aadhaarno = aadhaarno;
		Phno = phno;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAadhaarno() {
		return aadhaarno;
	}

	public void setAadhaarno(long aadhaarno) {
		this.aadhaarno = aadhaarno;
	}

	public long getPhno() {
		return Phno;
	}

	public void setPhno(long phno) {
		Phno = phno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	protected String name;
	protected long aadhaarno;
	protected long Phno;
	protected String address;
	
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadhaarno=" + aadhaarno + ", Phno=" + Phno + ", address=" + address + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
