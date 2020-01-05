package com.sathya.rms.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Ordermaster {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String omId;
	@Temporal(value=TemporalType.DATE)
	private Date omDate;
	private Double omBill;

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

	public Date getOmDate() {
		return omDate;
	}

	public void setOmDate(Date omDate) {
		this.omDate = omDate;
	}

	public Double getOmBill() {
		return omBill;
	}

	public void setOmBill(Double omBill) {
		this.omBill = omBill;
	}

	@Override
	public String toString() {
		return "Ordermaster [id=" + id + ", omId=" + omId + ", omDate=" + omDate + ", omBill=" + omBill + "]";
	}

}
