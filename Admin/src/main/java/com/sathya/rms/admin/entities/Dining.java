package com.sathya.rms.admin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DINING")
public class Dining {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name="D_ID")
	private String dId;
	
	@Column(name="CAPACITY")
	private Integer capacity;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDId() {
		return dId;
	}
	public void setDId(String dId) {
		this.dId = dId;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Dining [id=" + id + ", dId=" + dId + ", capacity=" + capacity + "]";
	}
	

}
