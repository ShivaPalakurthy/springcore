package com.springcore.auto.wire.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	@Autowired
	@Qualifier("address3") //used in case of two or more beans in xml file
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Emp(Address address) {
		super();
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}


}
