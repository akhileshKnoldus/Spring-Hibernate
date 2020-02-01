package com.akhilesh.supercar.carbooking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
public class Address {

	@Column(name = "email")
	private String email;
	
	@Column(name = "mobile")
	private long mobile;
	
	@Column(name = "street")
	private String street;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "country")
	private String country;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	

	/**
	 * @param email
	 * @param mobile
	 * @param street
	 * @param city
	 * @param state
	 * @param country
	 */
	public Address(String email, long mobile, String street, String city, String state, String country) {
		super();
		this.email = email;
		this.mobile = mobile;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [email=" + email + ", mobile=" + mobile + ", street=" + street + ", city=" + city + ", state="
				+ state + ", country=" + country + "]";
	}

}
