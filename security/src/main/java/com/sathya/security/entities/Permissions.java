package com.sathya.security.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class Permissions implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String permissionId;
	private String permissionName;
	private String permissionDescription;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getPermissionId() {
		return permissionId;
	}
	public void setPermissionId(String permissionId) {
		this.permissionId = permissionId;
	}
	public String getPermissionName() {
		return permissionName;
	}
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
	public String getPermissionDescription() {
		return permissionDescription;
	}
	public void setPermissionDescription(String permissionDescription) {
		this.permissionDescription = permissionDescription;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, permissionDescription, permissionId, permissionName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Permissions other = (Permissions) obj;
		return Objects.equals(id, other.id) && Objects.equals(permissionDescription, other.permissionDescription)
				&& Objects.equals(permissionId, other.permissionId)
				&& Objects.equals(permissionName, other.permissionName);
	}
	@Override
	public String toString() {
		return "Permissions [id=" + id + ", permissionId=" + permissionId + ", permissionName=" + permissionName
				+ ", permissionDescription=" + permissionDescription +"]";
	}	
		
}
