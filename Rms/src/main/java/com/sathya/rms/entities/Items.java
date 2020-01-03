package com.sathya.rms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class Items {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String iId;
	private String iName;
	private Long iPrice;
	private String iPic;
	@Transient
	private String gId;

	@ManyToOne
	@JoinColumn(name="g_id", nullable=false)
	private Groups groups;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getiId() {
		return iId;
	}
	public void setiId(String iId) {
		this.iId = iId;
	}
	public String getiName() {
		return iName;
	}
	public void setiName(String iName) {
		this.iName = iName;
	}
	public Long getiPrice() {
		return iPrice;
	}
	public void setiPrice(Long iPrice) {
		this.iPrice = iPrice;
	}
	public String getiPic() {
		return iPic;
	}
	public void setiPic(String iPic) {
		this.iPic = iPic;
	}
	public String getgId() {
		return gId;
	}
	public void setgId(String gId) {
		this.gId = gId;
	}
	public Groups getGroups() {
		return groups;
	}
	public void setGroups(Groups groups) {
		this.groups = groups;
	}
	@Override
	public String toString() {
		return "Items [id=" + id + ", iId=" + iId + ", iName=" + iName + ", iPrice=" + iPrice + ", iPic=" + iPic
				+ ", groups=" + groups + "]";
	}

}
