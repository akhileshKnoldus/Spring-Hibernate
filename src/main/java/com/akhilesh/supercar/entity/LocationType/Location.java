package com.akhilesh.supercar.entity.LocationType;

public class Location {
	private String locationId;
	private String street;
	private String city;
	private String state;
	private String pin;

	public Location() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param locationId
	 * @param street
	 * @param city
	 * @param state
	 * @param pin
	 */
	public Location(String locationId, String street, String city, String state, String pin) {
		super();
		this.locationId = locationId;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
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

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", pin=" + pin + "]";
	}
	
	
}
