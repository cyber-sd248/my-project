package com.sathya.rms.admin.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Restaurant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private Integer id;
	
	private String rId;
	
	private Long Phno;
	
	private String Email;

	private String locId;
    
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getrId() {
		return rId;
	}

	public void setrId(String rId) {
		this.rId = rId;
	}

	public Long getPhno() {
		return Phno;
	}

	public void setPhno(Long phno) {
		Phno = phno;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getLocId() {
		return locId;
	}

	public void setLocId(String locId) {
		this.locId = locId;
	}

	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", rId=" + rId + ", Phno=" + Phno + ", Email=" + Email + ", locId=" + locId
				+ "]";
	}
	
	

}
