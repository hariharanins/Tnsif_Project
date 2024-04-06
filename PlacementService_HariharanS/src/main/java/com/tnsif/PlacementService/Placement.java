package com.tnsif.PlacementService;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Placement {
	
	@Id
	@Column(name="cid")
	private int cid;
	@Column(name="name")
	private String name;
	@Column(name="address")
	private String address;
	@Column(name="rollno")
	private int rollno;
	@Column(name="department")
	private String department;
	@Column(name="percentage")
	private int percentge;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getPercentge() {
		return percentge;
	}
	public void setPercentge(int percentge) {
		this.percentge = percentge;
	}
	public Placement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Placement(int cid, String name, String address, int rollno, String department, int percentge) {
		super();
		this.cid = cid;
		this.name = name;
		this.address = address;
		this.rollno = rollno;
		this.department = department;
		this.percentge = percentge;
	}
	@Override
	public String toString() {
		return "Placement [cid=" + cid + ", name=" + name + ", address=" + address + ", rollno=" + rollno
				+ ", department=" + department + ", percentge=" + percentge + "]";
	}
	
	

}
