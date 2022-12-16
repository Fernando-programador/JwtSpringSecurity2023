package com.fsc.jwt.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class User implements UserDetails, Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "username", length = 60, unique = true)
	private String userName;

	@Column(name = "fullname", length = 120)
	private String fullName;

	@Column(name = "password", length = 180)
	private String password;

	@Column(name = "account_non_expired")
	private Boolean account_non_expired;

	@Column(name = "account_non_locked")
	private Boolean account_non_locked;

	@Column(name = "credentials_non_expired")
	private Boolean credentials_non_expired;

	@Column(name = "enabled")
	private Long enabled;

	@ManyToMany
	@Column(name = "id_user")
	private Long id_user;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "user_permission", joinColumns = { @JoinColumn(name = "id_user") }, inverseJoinColumns = {
			@JoinColumn(name = "id_permission") })
	@Column(name = "id_permission")
	private List<Permission> permissions;

	public List<String> getRoles() {
		List<String> roles = new ArrayList<>();
		for (Permission permission : permissions) {
			roles.add(permission.getDescription());
		}
		return roles;
	}

	public User() {
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {

		return this.permissions;
	}

	@Override
	public String getPassword() {

		return this.password;
	}

	@Override
	public String getUsername() {

		return this.userName;
	}

	@Override
	public boolean isAccountNonExpired() {

		return this.isAccountNonExpired();
	}

	@Override
	public boolean isAccountNonLocked() {

		return this.isAccountNonLocked();
	}

	@Override
	public boolean isCredentialsNonExpired() {

		return this.isCredentialsNonExpired();
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

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

	public Long getId_user() {
		return id_user;
	}

	public void setId_user(Long id_user) {
		this.id_user = id_user;
	}

	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
