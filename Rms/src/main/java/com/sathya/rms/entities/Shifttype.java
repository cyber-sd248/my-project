package com.sathya.rms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shifttype {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String sType;
	private Integer sStart;
	private Integer sEnd;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getsType() {
		return sType;
	}
	public void setsType(String sType) {
		this.sType = sType;
	}
	public Integer getsStart() {
		return sStart;
	}
	public void setsStart(Integer sStart) {
		this.sStart = sStart;
	}
	public Integer getsEnd() {
		return sEnd;
	}
	public void setsEnd(Integer sEnd) {
		this.sEnd = sEnd;
	}
	@Override
	public String toString() {
		return "Shifttype [id=" + id + ", sType=" + sType + ", sStart=" + sStart + ", sEnd=" + sEnd + "]";
	}
	

}
