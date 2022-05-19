package com.mindgate.pojo;

public class Address {

	private int addreeeId;
	private String street;
	private String city;
	private String state;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(int addreeeId, String street, String city, String state) {
		super();
		this.addreeeId = addreeeId;
		this.street = street;
		this.city = city;
		this.state = state;
	}

	public int getAddreeeId() {
		return addreeeId;
	}

	public void setAddreeeId(int addreeeId) {
		this.addreeeId = addreeeId;
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

	@Override
	public String toString() {
		return "Address [addreeeId=" + addreeeId + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}

}
