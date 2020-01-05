package com.sathya.security.entities;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="USERS")
public class Users{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String username;
	
	private String password;

	private String emailId;
	
	private Integer phnoNo;
	
	private String firstName;
	
	private String lastName;

	private String address1;
	
	private String address2;
	
	private String country;
	
	private String state;
	
	private String zip;
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date CreatedOn;
	private String role;
	private String avatar;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Integer getPhnoNo() {
		return phnoNo;
	}
	public void setPhnoNo(Integer phnoNo) {
		this.phnoNo = phnoNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public Date getCreatedOn() {
		return CreatedOn;
	}
	public void setCreatedOn(Date createdOn) {
		CreatedOn = createdOn;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", password=" + password + ", emailId=" + emailId
				+ ", phnoNo=" + phnoNo + ", firstName=" + firstName + ", lastName=" + lastName + ", address1="
				+ address1 + ", address2=" + address2 + ", country=" + country + ", state=" + state + ", zip=" + zip
				+ ", CreatedOn=" + CreatedOn + ", role=" + role + ", avatar=" + avatar + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(CreatedOn, address1, address2, avatar, country, emailId, firstName, id, lastName, password,
				phnoNo, role, state, username, zip);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		return Objects.equals(CreatedOn, other.CreatedOn) && Objects.equals(address1, other.address1)
				&& Objects.equals(address2, other.address2) && Objects.equals(avatar, other.avatar)
				&& Objects.equals(country, other.country) && Objects.equals(emailId, other.emailId)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(id, other.id)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(password, other.password)
				&& Objects.equals(phnoNo, other.phnoNo) && Objects.equals(role, other.role)
				&& Objects.equals(state, other.state) && Objects.equals(username, other.username)
				&& Objects.equals(zip, other.zip);
	}
	
	
}
