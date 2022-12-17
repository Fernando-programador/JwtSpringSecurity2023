package com.fsc.jwt.Dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class TokenDto implements Serializable {


	private static final long serialVersionUID = 1L;

	
	private String username; 
	
	private Boolean authentication;
	
	private Date created;
	
	private Date expiration;
	
	private String accessToken;
	
	private String refreshToken;

	public TokenDto() {
	}

	public TokenDto(String username, Boolean authentication, Date created, Date expiration, String accessToken,
			String refreshToken) {
		super();
		this.username = username;
		this.authentication = authentication;
		this.created = created;
		this.expiration = expiration;
		this.accessToken = accessToken;
		this.refreshToken = refreshToken;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Boolean getAuthentication() {
		return authentication;
	}

	public void setAuthentication(Boolean authentication) {
		this.authentication = authentication;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getExpiration() {
		return expiration;
	}

	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accessToken, authentication, created, expiration, refreshToken, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TokenDto other = (TokenDto) obj;
		return Objects.equals(accessToken, other.accessToken) && Objects.equals(authentication, other.authentication)
				&& Objects.equals(created, other.created) && Objects.equals(expiration, other.expiration)
				&& Objects.equals(refreshToken, other.refreshToken) && Objects.equals(username, other.username);
	}
	
	
	
	
	
	
	
}
