package com.sathya.rms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String eId;
	private String eName;
	private Integer esalary;
	private Integer ePhno;
	private String desigId;
	private String rId;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String geteId() {
		return eId;
	}
	public void seteId(String eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public Integer getEsalary() {
		return esalary;
	}
	public void setEsalary(Integer esalary) {
		this.esalary = esalary;
	}
	public Integer getePhno() {
		return ePhno;
	}
	public void setePhno(Integer ePhno) {
		this.ePhno = ePhno;
	}
	public String getDesigId() {
		return desigId;
	}
	public void setDesigId(String desigId) {
		this.desigId = desigId;
	}
	public String getrId() {
		return rId;
	}
	public void setrId(String rId) {
		this.rId = rId;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", eId=" + eId + ", eName=" + eName + ", eSalary=" + esalary + ", ePhno=" + ePhno
				+ ", desigId=" + desigId + ", rId=" + rId + "]";
	}
	
	
	
}
