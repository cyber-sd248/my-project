package com.sathya.security.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class Permissions{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer permissionId;
	
	private String permissionName;
	private String permissionDescription;
	@Transient
	private Integer roleId;
	
	@ManyToOne
	@JoinColumn(name="role_id", nullable=false)
	Roles roles;
	
	public Integer getPermissionId() {
		return permissionId;
	}
	public void setPermissionId(Integer permissionId) {
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
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	
	public Roles getRoles() {
		return roles;
	}
	public void setRoles(Roles roles) {
		this.roles = roles;
	}
	
	@Override
	public String toString() {
		return "Permissions [permissionId=" + permissionId + ", permissionName=" + permissionName
				+ ", permissionDescription=" + permissionDescription + ", roles=" + roles + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(permissionDescription, permissionId, permissionName);
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
		return Objects.equals(permissionDescription, other.permissionDescription)
				&& Objects.equals(permissionId, other.permissionId)
				&& Objects.equals(permissionName, other.permissionName) && Objects.equals(roleId, other.roleId);
	}
	
	
}
