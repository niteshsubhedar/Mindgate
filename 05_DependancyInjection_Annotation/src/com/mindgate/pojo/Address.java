package com.mindgate.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("address")
@Scope("prototype")
public class Address {

	private int addreeeId;
	private String street;
	private String city;
	private String state;

	public Address() {

	System.out.println("default constructer of Address Called");
	}

	public Address(int addreeeId, String street, String city, String state) {
		super();
		this.addreeeId = addreeeId;
		this.street = street;
		this.city = city;
		this.state = state;
	System.out.println("Overloaded constructer of Address Called");
	}

	public int getAddreeeId() {
		return addreeeId;
	}

	public void setAddreeeId(int addreeeId) {
		System.out.println("Setting Address Id :"+addreeeId);
		this.addreeeId = addreeeId;
	}

	public String getStreet() {

		return street;
	}

	public void setStreet(String street) {

		this.street = street;
		System.out.println("Setting street: "+street);

	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {

		this.city = city;
		System.out.println("Setting City :"+city);

	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("Setting state: "+state);

	}

	@Override
	public String toString() {
		return "Address [addreeeId=" + addreeeId + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}

}
