package com.sathya.security.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Roles{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer roleId;
	private String roleName;
	private String roleDescription;
		
	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}


	@Override
	public String toString() {
		return "Roles [roleId=" + roleId + ", roleName=" + roleName + ", roleDescription=" + roleDescription + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(roleDescription, roleId, roleName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Roles other = (Roles) obj;
		return Objects.equals(roleDescription, other.roleDescription) && Objects.equals(roleId, other.roleId)
				&& Objects.equals(roleName, other.roleName);
	}
	
	
}
