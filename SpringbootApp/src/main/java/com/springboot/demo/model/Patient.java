package com.springboot.demo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class Patient {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int pid;
	@Column
	private String pname;
	@Column
	private String gender;
	@Column
	private String diagnosis;
	@Column
	private Date dob;
	@Column
	private int ward_no;
	@Column
	private int bed_no;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getWard_no() {
		return ward_no;
	}
	public void setWard_no(int ward_no) {
		this.ward_no = ward_no;
	}
	public int getBed_no() {
		return bed_no;
	}
	public void setBed_no(int bed_no) {
		this.bed_no = bed_no;
	}
	@Override
	public String toString() {
		return "springModel [pid=" + pid + ", pname=" + pname + ", gender=" + gender + ", diagnosis=" + diagnosis
				+ ", dob=" + dob + ", ward_no=" + ward_no + ", bed_no=" + bed_no + "]";
	}
}
