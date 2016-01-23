package com.hb.core.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
// @PrimaryKeyJoinColumn
public class AuthUser {
	@Id
	@GeneratedValue
	// @Column(name="harish")
	public Integer id;

	@Column
	public String userName;

	@Column
	public String password;

	@Column
	public boolean enabled = true;

	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	public UserProperties userProperties;

	public AuthUser() {
	}

	public AuthUser(String userName, String password, boolean enabled) {
		this.userName = userName;
		this.password = password;
		this.enabled = enabled;
	}
}
