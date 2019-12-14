package com.sathya.rms.admin.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="city")
public class City {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String cId;
	private String cName;
	@Transient	
	private String stId;
	@ManyToOne
	@JoinColumn(name="st_id", nullable=false)
	private State state;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getStId() {
		return stId;
	}
	public void setStId(String stId) {
		this.stId = stId;
	}
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "City [id=" + id + ", cId=" + cId + ", cName=" + cName + ", state=" + state + "]";
	}

	
	
}
