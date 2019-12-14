package com.sathya.rms.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Ordermaster {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
    @Column(unique=true)
	private String omId;
	@Temporal(value=TemporalType.DATE)
	private Date oDate;
	private Integer bill;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOmId() {
		return omId;
	}
	public void setOmId(String omId) {
		this.omId = omId;
	}
	public Date getoDate() {
		return oDate;
	}
	public void setoDate(Date oDate) {
		this.oDate = oDate;
	}
	public Integer getBill() {
		return bill;
	}
	public void setBill(Integer bill) {
		this.bill = bill;
	}
	@Override
	public String toString() {
		return "Ordermaster [id=" + id + ", omId=" + omId + ", oDate=" + oDate + ", bill=" + bill + "]";
	}
	
	
}
