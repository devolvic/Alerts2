package com.safetynet.alerts.model.output;

public class Resident {
	String firstName;
	String lastName;
	String address;
	String phone;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Resident(Citizen citizen) {
		this.firstName = citizen.getFirstName();
		this.lastName = citizen.getLastName();
		this.address = citizen.getAddress();
		this.phone = citizen.getPhone();
	}
	
	
}