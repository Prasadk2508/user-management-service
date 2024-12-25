package com.pd.usm.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_details")
//@Table(name = "user_details",schema = "schema_name")
public class User {

	@Id // JPA makes it as a PK in DB
	@GeneratedValue
	private long id;

	@Column(name = "user_name", length = 50, nullable = false, unique = true)
	private String username;
	
	@Column(name = "first_name", length = 50, nullable = false)
	private String firstname;
	
	@Column(name = "last_name", length = 50, nullable = false)
	private String lastname;
	
	@Column(name = "email_address", length = 50, nullable = false)
	private String email;
	
	@Column(name = "role", length = 50, nullable = false)
	private String role;

	@Column(name = "ssn", length = 50, nullable = false, unique = true)
	private String ssn;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User() {

	}

	public User(long id, String username, String firstname, String lastname, String email, String role, String ssn) {
		super();
		this.id = id;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.role = role;
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", lastname=" + lastname + ", email=" + email + ", role="
				+ role + ", ssn=" + ssn + "]";
	}

}
