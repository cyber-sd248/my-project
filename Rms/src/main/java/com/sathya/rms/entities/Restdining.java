package com.sathya.rms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Restdining {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  Integer id;
	private String rId;
	private String dId;
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
	public String getdId() {
		return dId;
	}
	public void setdId(String dId) {
		this.dId = dId;
	}
	@Override
	public String toString() {
		return "Restdining [id=" + id + ", rId=" + rId + ", dId=" + dId + "]";
	}
	
}
