package com.hb.core.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
// @PrimaryKeyJoinColumn
public class AuthUser {
	@Id
	@GeneratedValue
	// @Column(name=")
	public Integer id;

	@Column
	public String userName;

	@Column
	public String password;

	@Column
	public boolean enabled = true;

	@OneToOne(mappedBy = "user")
	public UserProperties userProperties;

	@OneToMany(mappedBy="user")
	//@JoinColumn(name="hurrrr")
	public List<Plan> plans = new ArrayList<Plan>();

	public AuthUser() {
	}

	public AuthUser(String userName, String password, boolean enabled) {
		this.userName = userName;
		this.password = password;
		this.enabled = enabled;
	}

	public void addPlan(Plan plan) {
		plan.user = this;
		plans.add(plan);
	}
}
