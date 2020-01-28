package com.sathya.security.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class Roles implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String roleId;
	private String roleName;
	private String roleDescription;
	
	@Transient
	private String permissionId;	
	@OneToMany
	@JoinColumn(name="p_id")
	private Set<Permissions> permissions;
	public Roles() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
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

	public String getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(String permissionId) {
		this.permissionId = permissionId;
	}
	

	public Set<Permissions> getPermissions() {
		return permissions;
	}

	public void setPermissions(Set<Permissions> permissions) {
		this.permissions = permissions;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, permissionId, permissions, roleDescription, roleId, roleName);
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
		return Objects.equals(id, other.id) && Objects.equals(permissionId, other.permissionId)
				&& Objects.equals(permissions, other.permissions)
				&& Objects.equals(roleDescription, other.roleDescription) && Objects.equals(roleId, other.roleId)
				&& Objects.equals(roleName, other.roleName);
	}

	@Override
	public String toString() {
		return "Roles [id=" + id + ", roleId=" + roleId + ", roleName=" + roleName + ", roleDescription="
				+ roleDescription + ", permissionId=" + permissionId + ", permissions=" + permissions + "]";
	}	
		
}
