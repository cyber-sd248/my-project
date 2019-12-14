package com.sathya.rms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String uId;
	private String uName;
	private Long uPhno;
	private String emailId;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public Long getuPhno() {
		return uPhno;
	}
	public void setuPhno(Long uPhno) {
		this.uPhno = uPhno;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", uId=" + uId + ", uName=" + uName + ", uPhno=" + uPhno + ", emailId=" + emailId
				+ "]";
	}
	
}
