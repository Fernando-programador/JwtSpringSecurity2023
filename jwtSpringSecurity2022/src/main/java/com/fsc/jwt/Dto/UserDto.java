package com.fsc.jwt.Dto;



public class UserDto {

	private Long id;

	private String userName;

	private String fullName;

	private String password;

	private Boolean account_non_expired;

	private Boolean account_non_locked;

	private Boolean credentials_non_expired;

	private Long enabled;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getAccount_non_expired() {
		return account_non_expired;
	}

	public void setAccount_non_expired(Boolean account_non_expired) {
		this.account_non_expired = account_non_expired;
	}

	public Boolean getAccount_non_locked() {
		return account_non_locked;
	}

	public void setAccount_non_locked(Boolean account_non_locked) {
		this.account_non_locked = account_non_locked;
	}

	public Boolean getCredentials_non_expired() {
		return credentials_non_expired;
	}

	public void setCredentials_non_expired(Boolean credentials_non_expired) {
		this.credentials_non_expired = credentials_non_expired;
	}

	public Long getEnabled() {
		return enabled;
	}

	public void setEnabled(Long enabled) {
		this.enabled = enabled;
	}

	
	
}
