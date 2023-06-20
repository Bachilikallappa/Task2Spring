package com.jspiders;

public class Employee {

	private int id;
	private String name;
	private String qualification;
	private String mail;
	private int pno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", qualification=" + qualification + ", mail=" + mail
				+ ", pno=" + pno + "]";
	}
	
	
}
