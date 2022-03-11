package org.diembo.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)

@Entity
public class Persons extends GenericEntity {


	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "FIRST_NAME", length=140, nullable = false)
	private String firstName;

	@Column(length=140, nullable = false,unique = true)
	private String login;
	
	@Column(nullable = false)
	private String password;

	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

 
	@Column(name = "LAST_NAME", length=140, nullable = false)
	private String lastName;

	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	@Column(name = "DATE_OF_BIRTH", nullable = false)
	private java.util.Date dateOfBirth;
	public void setDateOfBirth(java.util.Date value) {
		this.dateOfBirth = value;
	}
	public java.util.Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	@Column(name = "PHONE", length=30)
	private String phone;
	public void setPhone(String value) {
		this.phone = value;
	}
	public String getPhone() {
		return this.phone;
	}

	@Column(name = "EMAIL", length=60)
	private String email;
	public void setEmail(String value) {
		this.email = value;
	}
	public String getEmail() {
		return this.email;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	private static final long serialVersionUID = 1L;

	@Override
	public void setIdToNull() {
		// TODO Auto-generated method stub
		
	}



}
