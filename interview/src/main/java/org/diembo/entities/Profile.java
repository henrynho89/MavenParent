package org.diembo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)

@Entity
public class Profile extends GenericEntity
{
	@Column(name = "PROFILE_ID", nullable=false)
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "PROFILE_CODE", length=30, nullable=false)
	private String profile_code;
	public void setProfileCode(String value) {
		this.profile_code = value;
	}
	public String getProfileCode(){
		return this.profile_code;
	}


	@Column(name = "NAME", length=140, nullable=false)
	private String name;
	public void setName(String value) {
		this.name = value;
	}
	public String getName(){
		return this.name;
	}

	// .---------------------------------------------------------------------------. //


	private static final long serialVersionUID = 1L;
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setIdToNull() {
		// TODO Auto-generated method stub
		
	}
	public String getProfile_code() {
		return profile_code;
	}
	public void setProfile_code(String profile_code) {
		this.profile_code = profile_code;
	}
	public void setId(Long id) {
		this.id = id;
	}


	// .---------------------------------------------------------------------------. //

}
