package com.hb.core.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@GenericGenerator(name = "foreign_harish", strategy = "foreign", parameters = {
		@Parameter(name = "property", value = "user") })
public class UserProperties {

	@Id
	@GeneratedValue(generator = "foreign_harish")
	public Integer id;

	@Column
	public String address;

	@Column
	public Integer coins;
	
	@OneToOne
	public AuthUser user;

	public UserProperties() {
	}

	public UserProperties(String address, Integer coins) {
		this.address = address;
		this.coins = coins;
	}

}
