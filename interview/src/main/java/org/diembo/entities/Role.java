package org.diembo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@JsonInclude(Include.NON_NULL)
@Entity
public class Role extends GenericEntity {
	
	@Id
	@GeneratedValue
	protected Long id;

	@ManyToOne
	@JoinColumn(name = "PROFILE_ID", foreignKey=@ForeignKey(name="FK_ROLE_PROFILE_R_PROFILE"), nullable = false)
	public Profile profile;

	@Column(name = "ROLE_CODE", length=30, nullable = false)
	protected String role_code;

	@Column(name = "NAME", length=140, nullable = false)
	protected String name;

	

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Profile getProfile() {
		return profile;
	}



	public void setProfile(Profile profile) {
		this.profile = profile;
	}



	public String getRole_code() {
		return role_code;
	}



	public void setRole_code(String role_code) {
		this.role_code = role_code;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	private static final long serialVersionUID = 1L;



	@Override
	public void setIdToNull() {
		// TODO Auto-generated method stub
		
	}

}
