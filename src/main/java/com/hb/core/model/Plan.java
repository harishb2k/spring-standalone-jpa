package com.hb.core.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Plan {

	@Id
	@GeneratedValue
	public Integer id;

	@Column
	public String userName;

	@ManyToOne()
	//@JoinColumn(name="hurrrr", insertable=false, updatable=false)
	public AuthUser user;

	public Plan() {
	}

	public Plan(String userName) {
		this.userName = userName;
	}
	
}
