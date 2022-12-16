package com.nissan.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="tbllogin")
public class Login {
	//Instance variables
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer loginId;
	@Column(nullable = false, length = 30)
	@Size(min = 3)
	private String userName;
	@Column(nullable = false)
	@Size(min = 8, max = 15)
	private String password;
	@Column(nullable = false)
	@Size(min = 3)
	private String userType;
	private Boolean isActive;
	
	@JsonIgnore
	@OneToOne(mappedBy="login",cascade=CascadeType.ALL)
	private User user;

	//Getter and Setters
	public Integer getLoginId() {
		return loginId;
	}

	
	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

	
	
	
	

}
