package com.sathya.rms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity

public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
    
	private String oId;
	private String iId;
	private Integer qty;
	private Integer amnt;
	@Transient
	private String omId;
	
	@ManyToOne
	@JoinColumn(name="om_id")
	private Ordermaster ordermasters;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getoId() {
		return oId;
	}

	public void setoId(String oId) {
		this.oId = oId;
	}

	public String getiId() {
		return iId;
	}

	public void setiId(String iId) {
		this.iId = iId;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Integer getAmnt() {
		return amnt;
	}

	public void setAmnt(Integer amnt) {
		this.amnt = amnt;
	}

	public String getOmId() {
		return omId;
	}

	public void setOmId(String omId) {
		this.omId = omId;
	}

	public Ordermaster getOrdermasters() {
		return ordermasters;
	}

	public void setOrdermasters(Ordermaster ordermasters) {
		this.ordermasters = ordermasters;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", oId=" + oId + ", iId=" + iId + ", qty=" + qty + ", amnt=" + amnt + ", omId="
				+ omId + ", ordermasters=" + ordermasters + "]";
	}
	
}
