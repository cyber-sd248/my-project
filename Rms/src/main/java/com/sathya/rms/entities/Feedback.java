package com.sathya.rms.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Feedback {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;
	private String uId;
	private String fb;
	@Temporal(value=TemporalType.DATE)
	private Date fdate;
	
	public  Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public  String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	public  String getFb() {
		return fb;
	}
	public void setFb(String fb) {
		this.fb = fb;
	}
	public  Date getFdate() {
		return fdate;
	}
	public void setFdate(Date fdate) {
		this.fdate = fdate;
	}
	@Override
	public String toString() {
		return "Feedback [id=" + id + ", uId=" + uId + ", fb=" + fb + ", fdate=" + fdate + "]";
	}
	
}
