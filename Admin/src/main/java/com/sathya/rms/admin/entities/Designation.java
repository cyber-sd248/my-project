package com.sathya.rms.admin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.web.bind.annotation.RequestMapping;

@Entity
@RequestMapping(path="/roles")

public class Designation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="DESIG_ID")
	private String desigId;
	
	@Column(name="DESIG_NAME")
	private String desigName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDesigId() {
		return desigId;
	}

	public void setDesigId(String desigId) {
		this.desigId = desigId;
	}

	public String getDesigName() {
		return desigName;
	}

	public void setDesigName(String desigName) {
		this.desigName = desigName;
	}

	@Override
	public String toString() {
		return "Designation [id=" + id + ", desigId=" + desigId + ", desigName=" + desigName + "]";
	}
	

}
